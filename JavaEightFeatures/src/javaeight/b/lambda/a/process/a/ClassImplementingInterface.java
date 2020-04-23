package javaeight.b.lambda.a.process.a;

@FunctionalInterface
interface A {
	void show();
}

class B implements A {

	@Override
	public void show() {
		System.out.println("B");
	}

}

public class ClassImplementingInterface {

	public static void main(final String[] args) {

		final A a1 = new B();
		a1.show();

	}

}
