package javaeight.d.streams.c.methods.a.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IStreamLimitAndSkipExample {
	public static void main(final String[] args) {
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		// First 5 numbers
		final List<Integer> limit5numbers = numbers.stream().limit(5).collect(Collectors.toList());
		limit5numbers.forEach(System.out::println);

		System.out.println("-----");

		// Skip first 5 numbers
		final List<Integer> skip5numbers = numbers.stream().skip(5).collect(Collectors.toList());
		skip5numbers.forEach(System.out::println);

	}
}
