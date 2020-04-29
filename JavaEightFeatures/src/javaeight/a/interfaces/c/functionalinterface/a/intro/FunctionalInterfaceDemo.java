package javaeight.a.interfaces.c.functionalinterface.a.intro;

@FunctionalInterface
interface IFunctionalSimple {
	// abstract method
	void fly();

}

//must have a single abstract method, 
//but may have any of default and static methods
@FunctionalInterface
interface IFunctional {

	// abstract method
	void show();

	// default method-1
	default void sayHello() {
		System.out.println("Hello");
	}

	// default method-2
	default void walk() {
		System.out.println("Walking...");
	}

	// static method-1
	static int add(final int a, final int b) {
		return a + b;
	}

	// static method-2
	static int add(final int a, final int b, final int c) {
		return a + b + c;
	}

}

class A implements IFunctional {

	@Override
	public void show() {
		System.out.println("show() method implementation from class A");
	}

}

public class FunctionalInterfaceDemo {

	public static void main(final String[] args) {

		final A a = new A();
		a.show();

	}

}
