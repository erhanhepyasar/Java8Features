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

	@Override
	public void show() {
		System.out.println("show in -class-");
	}

}

public class InterfaceDefaultMethodInheritance {

	public static void main(final String[] args) {
		final C c = new C();
		c.show();

	}

}
