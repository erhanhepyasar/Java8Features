package oop;

interface InterfaceA {
	void showMe();
}

interface InterfaceB {
	void showMe();
}

interface InterfaceC extends InterfaceA, InterfaceB {

}

class ClassA implements InterfaceC {

	@Override
	public void showMe() {
		System.out.println("class A");

	}

}

public class InheritanceDemo {

	public static void main(final String[] args) {
		new ClassA().showMe();
		new InterfaceA() {

			@Override
			public void showMe() {
				System.out.println("show show");

			}
		}.showMe();

	}

}
