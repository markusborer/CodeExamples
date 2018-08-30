package ch.adesso.examples.random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		System.out.println("R1");
		Random r1 = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(r1.nextInt(10));
		}
		
		System.out.println("");
		System.out.println("R2");
		Random r2 = new Random(12);
		for (int i = 0; i < 10; i++) {
			System.out.println(r2.nextInt(10));
		}

		System.out.println("");
		System.out.println("R3");
		for (int i = 0; i < 10; i++) {
			Random r3 = new Random(12);
			System.out.println(r3.nextInt(10));
		}
	}

}
