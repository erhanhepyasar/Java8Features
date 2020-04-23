package oop;

class A {
	public A() {
		System.out.println("A");
	}

	public A(final int i) {
		System.out.println("i in A");
	}
}

class B extends A {
	public B() {
		super();
		System.out.println("B");
	}

	public B(final int i) {
		super(i);
		System.out.println("i in B");
	}
}

public class Inheritance {

	public static void main(final String[] args) {
		final B b = new B(5);

	}

}
