package javaeight.d.streamapi.c.methods.c.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
	public static void main(final String[] args) {
		// sum
		final int sum = IntStream.rangeClosed(0, 1000).sum();
		System.out.println("sum of 1000 numbers is: " + sum);

		// min
		final OptionalInt min = IntStream.rangeClosed(0, 1000).min();
		if (min.isPresent())
			System.out.println("Minimum of 1000 numbers is: " + min.getAsInt());

		// max
		final OptionalInt max = IntStream.rangeClosed(0, 1000).max();
		if (max.isPresent())
			System.out.println("Max of 1000 numbers is: " + max.getAsInt());

		// average
		final OptionalDouble average = LongStream.rangeClosed(0, 1000).asDoubleStream().average();
		System.out.println("Average is: " + (average.isPresent() ? average.getAsDouble()
				: 0.0));

	}
}
