package ch.adesso.examples.dream;

/**
 * http://wouter.coekaerts.be/2012/puzzle-dreams
 */
public class Main {
	public static void main(String[] args) {
		int level = new Sleeper().enter(new Dream());
		System.out.println("Level: " + level);
		if (level != 0) {
			// The goal is to reach this line
			System.out.println("Am I still dreaming?");
		}
	}
}
