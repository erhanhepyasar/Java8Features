package javaeight.b.lambda.a.process.c;

interface A {
	void show();
}

public class LambdaExpression {

	public static void main(final String[] args) {

		final A a = () -> System.out.println("C");

		a.show();

	}

}

// Before Java 8, anonymous inner classes are used to implement functional interfaces. 
// After Java 8, you can use lambda expressions to implement functional interfaces.