package oop;

interface Movable {
	void move();
}

class Living {
	void haveFun() {
		System.out.println("have fun");
	}
}

abstract class Human extends Living implements Movable { // abstract class can extend normal class
	public abstract void eat();

	public void walk() {
		System.out.println("walk");
	}
}

class Man extends Human {

	@Override
	public void eat() {
		System.out.println("eat in Man");

	}

	public void swim() {
		System.out.println("swim");
	}

	@Override
	public void move() {
		System.out.println("move");

	}

}

public class AbstractClasses {

	public static void main(final String[] args) {
		final Man a = new Man();
		a.walk();
		a.eat();
		a.swim();
		a.haveFun();
		a.move();

		final Human b = new Man();
		b.walk();
		b.eat();
//		b.swim();
	}

}
