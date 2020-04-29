package javaeight.b.lambda.b.examples.c.concatenate;

public class ConcetanateTraditional implements ConcatenateInterface {
	@Override
	public String sconcat(final String a, final String b) {
		return a + " " + b;
	}

	public static void main(final String[] args) {
		final ConcetanateTraditional concetanateTraditional = new ConcetanateTraditional();
		String sconcat = concetanateTraditional.sconcat("Hello", "World");
		System.out.println(sconcat);

	}
}
