package javaeight.e.optional;

import java.util.Optional;

public class OptionalIfIsExample {
	public static void main(final String[] args) {
		// isPresent
		final Optional<String> stringOptional = Optional.ofNullable("Hello World");
		if (stringOptional.isPresent())
			System.out.println("stringOptional = " + stringOptional);

		stringOptional.ifPresent(s -> System.out.println("s = " + s));
	}
}
