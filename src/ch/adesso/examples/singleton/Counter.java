package ch.adesso.examples.singleton;

public class Counter {

	private static Counter instance;
	
	private int count;
	
	public static Counter getInstance() {
		if (instance == null) {
			instance = new Counter();
		}
		return instance;
	}
	
	public void increment() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public synchronized int getCount() {
		return count;
	}

}
