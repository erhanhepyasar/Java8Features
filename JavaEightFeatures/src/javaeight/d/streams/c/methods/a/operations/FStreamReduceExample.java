package javaeight.d.streams.c.methods.a.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FStreamReduceExample {
	public static void main(final String[] args) {
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		final int result1 = numbers.stream()
				.reduce(0, (a, b) -> a + b);

		System.out.println(result1);

		// 0 + 1 = 1
		// 1 + 2 = 3
		// 3 + 3 = 6
		// 6 + 4 = 10
		// 10 + 5 = 15
		// 15 + 6 = 21
		// 21 + 7 = 28
		// 28 + 8 = 36
		// 36 + 9 = 45

		// 1 * 1 = 1
		// 1 * 2 = 2

		// 0 * 1 = 0
		// 0 * 2 = 0
		// ... = 0
		final int result2 = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println(result2);

		// Method-2 (Returns Optional)
		final Optional<Integer> result3 = numbers.stream().reduce((a, b) -> a + b);

		if (result3.isPresent())
			System.out.println(result3.get());

	}

}
