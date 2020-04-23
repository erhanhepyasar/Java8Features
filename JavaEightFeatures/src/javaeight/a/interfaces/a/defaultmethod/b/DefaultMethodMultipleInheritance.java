package javaeight.a.interfaces.a.defaultmethod.b;

interface I {

	default void show() {
		System.out.println("show in interface -I-");
	}

}

interface J {

	default void show() {
		System.out.println("show in inteface -J-");
	}

}

class C implements I, J {

//  Explicitly specify which default method is to be used (Multiple inheritance)
//	@Override
//	public void show() {
//		I.super.show();
//	}

	// override the default method
	@Override
	public void show() {
		System.out.println("show in -class-");
	}

}

public class DefaultMethodMultipleInheritance {

	public static void main(final String[] args) {
		final C c = new C();
		c.show();

	}

}
