package ch.adesso.examples.dream;

public class Dream {
	
	public void dream(Sleeper s) {
		Thread t1 = new Thread() {
			public void run() {
				s.enter(new Dream() {
					public void dream(Sleeper s) {
						try {
							s.wait(1000);
						} catch (InterruptedException e) {
						}
					}
				});
			}
		};
		t1.start();
		try {
			s.wait(100);
		} catch (InterruptedException e) {
		}
    }
	
}
