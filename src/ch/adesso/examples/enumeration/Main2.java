package ch.adesso.examples.enumeration;

public class Main2 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			final String content = "Value is " + i;
			Thread thread = new Thread() {
				public void run() {
					Field.VALUE_1.setContent(content);
					System.out.println(Field.VALUE_1.getContent());
				}
			};
			thread.start();
		}
	}

}
