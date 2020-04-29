package javaeight.e.optional;

import java.util.Optional;

public class OptionalExample {
	public static void main(final String[] args) {

		final Integer[] numbers = new Integer[10];

		// NullPointerException:
		// int number = numbers[1].intValue();
		// System.out.println("number = " + number);

		final Optional<Integer> checkNullInt = Optional.ofNullable(numbers[1]);
		final int result = checkNullInt.isPresent() ? checkNullInt.get() : -1;
		System.out.println("result: " + result);

	}

}
