package javaeight.e.optional;

import java.util.Optional;

public class OptionalOrElseThrowExample {
	public static void main(final String[] args) {
		// orElse
		final Integer[] numbers = new Integer[10];
		numbers[0] = 1;
		final Optional<Integer> number = Optional.ofNullable(numbers[0]);
		int result = number.orElse(-1);
		System.out.println("result = " + result);

		// orElseGet
		result = number.orElseGet(() -> -1);
		System.out.println("result - orElseGet = " + result);

		// orElseThrow
		try {
			result = number.orElseThrow(Exception::new);
			System.out.println("result orElseThrow = " + result);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
