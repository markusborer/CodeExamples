package ch.adesso.examples.puzzles;

public class HelloGoodbye {

	public static void main(String[] args) {
		System.getProperties().list(System.out);
		//shutdownhooks
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				System.out.println("Goodbye world as hook");
			}
		});
		try {
			System.out.println("Hello world");
			// ...
			while(true) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//System.exit(0);
		} finally {
			System.out.println("Goodbye world");
		}
	}

}


























































