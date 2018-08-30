package ch.adesso.dojo.game2048;

public class Game2048 implements IGame2048 {
	
	private final static int SIZE = 4;
	
	private int[][] values = new int[SIZE][SIZE];

	public Game2048() {
		for (int row = 0; row < SIZE; row++) {
			for (int column = 0; column < SIZE; column++) {
				values[row][column] = 0;
			}			
		}
	}

	public Game2048(int v00, int v01, int v02, int v03, int v10, int v11, int v12, int v13, int v20, int v21, int v22, int v23, int v30, int v31, int v32, int v33) {
		values[0][0] = v00;
		values[1][0] = v01;
		values[2][0] = v02;
		values[3][0] = v03;
		values[0][1] = v10;
		values[1][1] = v11;
		values[2][1] = v12;
		values[3][1] = v13;
		values[0][2] = v20;
		values[1][2] = v21;
		values[2][2] = v22;
		values[3][2] = v23;
		values[0][3] = v30;
		values[1][3] = v31;
		values[2][3] = v32;
		values[3][3] = v33;
	}
	
	@Override
	public int getValue(int x, int y) {
		return values[x][y];
	}

	@Override
	public int getSize() {
		return SIZE;
	}

	@Override
	public void cmdLeft() {
		moveLeft();
		mergeLeft();
		moveLeft();
	}

	@Override
	public void cmdUp() {
		moveUp();
		mergeUp();
		moveUp();
	}

	@Override
	public void cmdRight() {
		// TODO Auto-generated method stub
	}

	@Override
	public void cmdDown() {
		// TODO Auto-generated method stub
	}

	private void moveLeft() {
		for (int row = 0; row < SIZE; row++) {
			int targetColumn = 0;
			for (int column = 1; column < SIZE; column++) {
				if (move(row, targetColumn, row, column)) {
					targetColumn++;
				}
			}
		}
	}

	private void moveUp() {
		for (int column = 0; column < SIZE; column++) {
			int targetRow = 0;
			for (int row = 1; row < SIZE; row++) {
				if (move(targetRow, column, row, column)) {
					targetRow++;
				}
			}
		}
	}

	private boolean move(int firstRow, int firstColumn, int secondRow, int secondColumn) {
		int firstValue = values[firstColumn][firstRow];
		int secondValue = values[secondColumn][secondRow];
		if (firstValue == 0) {
			values[firstColumn][firstRow] = firstValue + secondValue;
			values[secondColumn][secondRow] = 0;
		}
		return firstValue > 0;
	}

	private void mergeLeft() {
		for (int row = 0; row < SIZE; row++) {
			for (int column = 1; column < SIZE; column++) {
				merge(row, column - 1, row, column);
			}
		}
	}

	private void mergeUp() {
		for (int column = 0; column < SIZE; column++) {
			for (int row = 1; row < SIZE; row++) {
				merge(row - 1, column, row, column);
			}
		}
	}

	private void merge(int firstRow, int firstColumn, int secondRow, int secondColumn) {
		int firstValue = values[firstColumn][firstRow];
		int secondValue = values[secondColumn][secondRow];
		if (firstValue == secondValue) {
			values[firstColumn][firstRow] = firstValue + secondValue;
			values[secondColumn][secondRow] = 0;
		}
	}

	@Override
	public boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return 0;
	}

}
