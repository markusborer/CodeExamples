package ch.adesso.examples.hierarchie;

public class HierarchieTest {

	public static void main(String[] args) {

		Base base = new Base();
		Derived derived = new Derived();

//		base.test();
//		derived.test();

//		Base.staticTest();
//		Derived.staticTest();

		base.staticTest();
		derived.staticTest();

	}

}
