package javaeight.b.lambda.b.examples.c.concatenate;

public class ConcetenateLambda {

	public static void main(final String[] args) {
		final ConcatenateInterface concatenateInterface = (a, b) -> a + " " + b;
		final String sconcat = concatenateInterface.sconcat("Hello", "World");
		System.out.println(sconcat);
	}
}
