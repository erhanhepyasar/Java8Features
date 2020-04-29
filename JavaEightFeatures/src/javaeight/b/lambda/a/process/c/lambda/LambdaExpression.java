package javaeight.b.lambda.a.process.c.lambda;

@FunctionalInterface
interface A {
	void show();
}

public class LambdaExpression {

	public static void main(final String[] args) {

		// Anonymous class to Lambda Transformation
		final A a = new A() {

			@Override
			public void show() {
				System.out.println("Hello !!");

			}
		};

//		final A a = () -> System.out.println("A");
//		a.show();

	}

}
