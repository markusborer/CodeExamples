package ch.adesso.examples.clown;

import java.util.ArrayList;
import java.util.List;

/**
 * http://wouter.coekaerts.be/2012/puzzle-dreams
 */
public class Main {

	private static Volkswagen volkswagen = new Volkswagen();

	public static void main(String[] args) {
		try {
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.add(new Clown());
			volkswagen.done();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Solution 1
	 */
	public static void xmain(String args[]) {
		volkswagen.add(new RecursiveClown());
		volkswagen.done();
	}

	private static int counter = 0;

	private static class RecursiveClown extends Clown {
		public int hashCode() {
			if (++counter < 20) {
				volkswagen.add(new RecursiveClown());
			}
			return super.hashCode();
		}
	}

	/**
	 * Solution 2
	 */
	public static void ymain(String[] args) {
		List<Thread> threads = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			Thread thread = new Thread() {
				public void run() {
					volkswagen.add(new WaitingClown());
				}
			};
			threads.add(thread);
		}
		for (Thread thread : threads) {
			thread.start();
		}
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
			}
		}
		volkswagen.done();
	}

	private static final class WaitingClown extends Clown {
		public int hashCode() {
			try {
				if (++counter < 20) {
					volkswagen.wait();
				}
				volkswagen.notify();
			} catch (InterruptedException e) {
			}
			return super.hashCode();
		}
	}

}
