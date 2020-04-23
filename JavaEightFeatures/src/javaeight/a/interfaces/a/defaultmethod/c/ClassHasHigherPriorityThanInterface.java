package javaeight.a.interfaces.a.defaultmethod.c;

interface I {
	default void show() {
		System.out.println("show in interface -I-");
	}
}

class A {
	public void show() {
		System.out.println("show in class -A-");
	}
}

class X extends A {
}

class Y implements I {
}

class Z extends A implements I {
}

public class ClassHasHigherPriorityThanInterface {

	public static void main(final String[] args) {

		final X x = new X();
		x.show();

		final Y y = new Y();
		y.show();

		final Z z = new Z();
		z.show();

	}

}
