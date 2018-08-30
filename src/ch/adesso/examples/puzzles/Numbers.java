package ch.adesso.examples.puzzles;

public class Numbers {

	public static void mainA(String[] args) {
		long a;
		a = 023l;
		System.out.println(a);
	}

	public static void mainB(String[] args) {
		long a = 5000000 * 5000;
		System.out.println(a);
		//System.out.println(Math.multiplyExact(5000000000000L, 1000000000000L));
	}

	public static void mainC(String[] args) {
		double a = 1 / 2;
		System.out.println(a);
	}

	public static void mainD(String[] args) {
		int a = 3, b = 4;
		System.out.println("Ergebnis: " + a + b);
		System.out.println(a + b + " kommt raus");
	}

	public static void mainE(String[] args) {
		double a, b;
		a = 2;
		b = 0.4;
		while (a != 0 ) {
			a = a - b;
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		int i = 0;
		while (i < 10);
		{
			i = i + 1;
			System.out.println(i * i);
		}
	}

}
