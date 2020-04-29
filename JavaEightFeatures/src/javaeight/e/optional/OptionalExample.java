package javaeight.e.optional;

import java.util.Optional;

public class OptionalExample {
	public static void main(final String[] args) {
		// Integer[] numbers = new Integer[10];
		// int number = numbers[1].intValue();
		// System.out.println("number = " + number);

		final Optional<String> optionalString = Optional.of("Hello World");
		System.out.println("optionalString = " + optionalString);

		System.out.println("getWords:" + getWords());

	}

	public static Optional<String> getWords() {
		final String[] words = new String[10];
		final Optional<String> optionalS = Optional.ofNullable(words[1]);
		if (optionalS.isPresent())
			return optionalS;
		else
			return Optional.empty();
	}
}
