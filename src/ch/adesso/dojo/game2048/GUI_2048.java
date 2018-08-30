package ch.adesso.dojo.game2048;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class GUI_2048 extends Application {

	private static final Color BACKGROUND_COLOR = Color.BEIGE;
    private static final int WINDOW_HEIGHT = 300;
	private static final int WINDOW_WIDTH = 550;
    private static final int X_PADDING = 30;
    private static final int Y_PADDING = 20;

	private IGame2048 game;
    private Group root;
    
    private int gridWidth;
    private int boardSize;
    private List<Group> tokens;

    private Label scoreLabel = new Label("");
    private Label gameOverLabel = new Label("");
    
	private static final Map<Integer,Color> COLORS = new HashMap<>();
	static {
		COLORS.put(2,Color.LIGHTSALMON);
		COLORS.put(4,Color.SANDYBROWN);
		COLORS.put(8,Color.CORAL);
		COLORS.put(16,Color.FUCHSIA);
		COLORS.put(32,Color.TOMATO);
		COLORS.put(64,Color.RED);
		COLORS.put(128,Color.LIME);
		COLORS.put(256,Color.YELLOW);
		COLORS.put(512,Color.AQUA);
		COLORS.put(1024,Color.ROYALBLUE);
		COLORS.put(2048,Color.BLUEVIOLET);
		COLORS.put(4096,Color.DARKVIOLET);
		COLORS.put(8192,Color.AQUA);
		COLORS.put(16384,Color.DARKGOLDENROD);
	}

	public GUI_2048() {
		boardSize = 4;
		gridWidth = (int) (WINDOW_HEIGHT / (1.16*boardSize));
		game = new Game2048();
		//game = new Game2048(0,2,4,8, 16,32,64,128, 256,512,1024,2048, 4096,8192,16384,0);
		tokens = new ArrayList<Group>();
	}
    
    @Override
	public void start(Stage primaryStage) throws Exception {
        init(primaryStage);
        primaryStage.show();
        initLabels();
        showBoard();
    }

	private void initLabels() {
		initLabel(scoreLabel, 320, 250, 24);
		initLabel(gameOverLabel, 320, 110, 30);
	}

	private void initLabel(Label label, int x, int y, int fontSize) {
		label.setLayoutX(x);
		label.setLayoutY(y);
		label.setFont(Font.font("SansSerif", FontWeight.BOLD, fontSize));
		label.setStyle("font-weight: bold");
		label.setAlignment(Pos.CENTER_LEFT);
		root.getChildren().add(label);
	}
	
	private void showBoard() {
		System.out.println(game);
		// clear board
		for (Group token : tokens) {
			root.getChildren().removeAll(token.getChildren());
			root.getChildren().remove(token);
		}
		tokens.clear();
		// add all tokens from game
		for (int i = 0; i < boardSize; i++) {
			for (int j = boardSize - 1; j >= 0; j--) {
				if (game.getValue(j, i) > 0) {
					addToken(i, j, game.getValue(j, i));
				}
			}
		}		
	    scoreLabel.setText("Your score: " + game.getScore());
	    if (game.isFinished()) {
	    	gameOverLabel.setText("* Game Over *");
	    }
	}

	private Node addToken(int boardX, int boardY, int value) {
        int tokenWidth = gridWidth - 8;
		int x = X_PADDING + ((gridWidth - tokenWidth) / 2) + (boardX * gridWidth);
        int y = Y_PADDING + ((gridWidth - tokenWidth) / 2) + (boardY * gridWidth);
        Rectangle token = createToken(x, y, tokenWidth, value);
        Label label = createLabel(x, y, tokenWidth, value);
        Group group = new Group();
        group.getChildren().add(token);
        group.getChildren().add(label);
        root.getChildren().add(group);
        tokens.add(group);
        return group;
	}

	private Label createLabel(int x, int y, int tokenWidth, int value) {
		Label label = new Label("" + value);
        label.setMinWidth(tokenWidth);
        label.setLayoutX(x);
        label.setLayoutY(y + 15);
        label.setFont(Font.font("SansSerif", FontWeight.BOLD, 20));
        label.setStyle("font-weight: bold");
        label.setAlignment(Pos.CENTER);
		return label;
	}

	private Rectangle createToken(int x, int y, int tokenWidth, int value) {
        Rectangle rect = new Rectangle(x, y, tokenWidth, tokenWidth);
        rect.setArcHeight(10);
        rect.setArcWidth(10);
        rect.setFill(getColor(value));
        return rect;
	}

	private Paint getColor(int value) {
		Color color = COLORS.get(value);
		if (color != null) {
			return color;
		}
		return Color.BEIGE;
	}

	private void init(Stage primaryStage) {
        root = new Group();
        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT, BACKGROUND_COLOR);
        addKeyListeners(scene);
		primaryStage.setScene(scene);
        createGrid();
	}

	private void addKeyListeners(Scene scene) {
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent ev) {
				switch (ev.getCode()) {
				case RIGHT:
					game.cmdRight();
					break;
				case LEFT:
					game.cmdLeft();
					break;
				case UP:
					game.cmdUp();
					break;
				case DOWN:
					game.cmdDown();
					break;
				//case U:
				//	game.undo();
				default:
					break;
				}
				showBoard();
			}
		});
	}

	
    private void createGrid() {
        for (int i = 0; i < boardSize * boardSize; ++i) {
            int x = X_PADDING + (i % boardSize) * (gridWidth);
            int y = Y_PADDING + (i / boardSize) * (gridWidth);
            Rectangle rect = new Rectangle(x, y, gridWidth, gridWidth);
            rect.setStroke(Color.BLACK);
            rect.setFill(Color.WHITE);
            root.getChildren().add(rect);
        }
	}
	
    public static void main(String[] args) {
        launch(args);
    }

}
