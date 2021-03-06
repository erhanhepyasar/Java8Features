package javaeight.a.interfaces.b.staticmethod;

// Interface static method can be directly called
// No need to create an implementation class

interface I {
	static void show() {
		System.out.println("This is a static method in interface I");
	}

	static int add(final int a, final int b) {
		return a + b;
	}
}

public class InterfaceStaticMethod {

	public static void main(final String[] args) {
		I.show();

		final int result = I.add(5, 4);
		System.out.println(result);

	}
}
