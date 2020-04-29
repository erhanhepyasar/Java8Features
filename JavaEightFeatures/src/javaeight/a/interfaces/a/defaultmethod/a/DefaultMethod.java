package javaeight.a.interfaces.a.defaultmethod.a;

interface Demo {

	// abstract method
	void abc();

	// default method
	default void show() {
		System.out.println("show");
	}
}

class DemoImpl implements Demo {

	@Override
	public void abc() {
		System.out.println("abc");
	}

}

public class DefaultMethod {

	public static void main(final String[] args) {

		final Demo demo = new DemoImpl();

		demo.show();
		demo.abc();

	}

}
