package javaeight.b.lambda.a.process.c;

@FunctionalInterface
interface A {
	void show();
}

public class LambdaExpression {

	public static void main(final String[] args) {

		final A a = () -> System.out.println("A");
		a.show();

	}

}
