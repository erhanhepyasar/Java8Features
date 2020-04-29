package javaeight.e.optional;

import java.util.Optional;

public class OptionalOfEmptyExample {
	public static void main(final String[] args) {
		final Optional<String> optionalString = Optional.of("Hello World");
		System.out.println("optionalString = " + optionalString);

		System.out.println("getWords: " + getWords());
	}

	public static Optional<String> getWords() {
		final String[] words = new String[10];
		// words[1] = "test";
		words[1] = "test";
		final Optional<String> optionalS = Optional.ofNullable(words[1]);
		if (optionalS.isPresent())
			return optionalS;
		else
			return Optional.empty();
	}
}
