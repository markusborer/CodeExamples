package ch.adesso.examples.dream;

public class Sleeper {
	private int level;

	public synchronized int enter(Dream dream) {
		level++;
		try {
			dream.dream(this);
		} finally {
			level--;
		}
		return level;
	}
}
