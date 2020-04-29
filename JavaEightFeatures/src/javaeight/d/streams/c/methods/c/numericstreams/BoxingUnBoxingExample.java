package javaeight.d.streams.c.methods.c.numericstreams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnBoxingExample {
	public static void main(final String[] args) {
		List<Integer> numbers;

		final IntStream numStream = IntStream.rangeClosed(0, 5000); // primitive int stream
		numbers = numStream.boxed().collect(Collectors.toList()); // boxing: int to Integer
		numbers.forEach(System.out::println);

		final Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b); // unboxing with reduce: Integer to int
		if (sum.isPresent())
			System.out.println(sum.get());

		final int sum1 = numbers.stream().mapToInt(Integer::intValue).sum(); // unboxing : Integer to int
		System.out.println(sum1);
	}
}
