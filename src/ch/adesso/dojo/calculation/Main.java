package ch.adesso.dojo.calculation;

public class Main {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
		square(1);
		square(10);
		square(100);
		square(1000);
		square(10000);
		square(100000);
		square(1000000);
		square(10000000);
		square(100000000);
		square(1000000000);
	}

	private static void test1() {
		int i = 2;
		int j = (i = 3) * i;
		System.out.println(j);
	}

	private static void test2() {
		int a = 9;
		a += (a = 3);
		System.out.println(a);
	}

	private static void test3() {
		int b = 9;
		b = b + (b = 3);
		System.out.println(b);
	}

	private static void test4() {
		int j = 1;
		try {
			int i = forgetIt() / (j = 2);
		} catch (Exception e) {
			System.out.println("Now j = " + j);
		}
	}

	private static int forgetIt() throws Exception {
		throw new Exception("I'm outta here!");
	}

	private static void square(int length) {
		System.out.println(length + " : " + (length * length));
	}

}
