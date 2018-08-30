package ch.adesso.examples.puzzles;

public class Haha {

	private String name;
	
	public Haha(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		super.toString();
		return name;
	}
	
	public static void main(String args[]) {
		System.out.println("Ha" + "ha");
		System.out.println('H' + 'a' + 'h' + 'a');
		System.out.println('H' + 0);
		System.out.println('a' + 0);
		System.out.println('h' + 0);
		System.out.println('a' + 0);
		System.out.println('a');
		Haha haha = new Haha("Haha");
		System.out.println(haha.getName());
	}

}
