package javaeight.a.interfaces.b.staticmethod;

// Interface static method can be directly called
// No need to create an implementation class

interface I {
	static void show() {
		System.out.println("Hello Netas");
	}

	static int add(final int a, final int b) {
		return a + b;
	}
}

public class InterfaceStaticMethod {

	public static void main(final String[] args) {
		I.show();
		System.out.println(I.add(5, 4));
	}
}
