package ch.adesso.dojo.game2048;

public interface IGame2048 {

	int getValue(int x, int y);

	int getSize();

	void cmdLeft();

	void cmdUp();

	void cmdRight();

	void cmdDown();

	boolean isFinished();

	int getScore();

	// void undo();
}