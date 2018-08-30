package ch.adesso.examples.singleton;

import java.util.ArrayList;
import java.util.List;

public class CounterTest {

	public static void main(String[] args) {
		testGetInstanceConcurrent();
		System.out.println("Count: " + Counter.getInstance().getCount());
	}

	private static void test() {
		Counter counter1 = Counter.getInstance();
		Counter counter2 = Counter.getInstance();
		counter1.increment();
		counter1.increment();
		counter1.increment();
		counter2.decrement();
	}

	private static void testGetInstanceConcurrent() {
		Thread counter1 = new Thread() {

			@Override
			public void run() {
				Counter counter = Counter.getInstance();
				counter.increment();
				counter.increment();
				counter.increment();
			}

		};
		Thread counter2 = new Thread() {

			@Override
			public void run() {
				Counter counter = Counter.getInstance();
				counter.decrement();
			}

		};
		counter1.start();
		counter2.start();
		try {
			counter1.join();
			counter2.join();
		} catch (InterruptedException e) {
		}
	}

	private static void testIncrementDecrementConcurrent() {
		Runnable counter = new Runnable() {

			@Override
			public void run() {
				Counter counter = Counter.getInstance();
				for (int i = 0; i < 1000; i++) {
					counter.increment();
					counter.decrement();
				}
			}

		};
		List<Thread> counters = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			counters.add(new Thread(counter));
		}
		for (Thread counterThread : counters) {
			counterThread.start();
		}
		for (Thread counterThread : counters) {
			try {
				counterThread.join();
			} catch (InterruptedException e) {
			}
		}
	}

}
