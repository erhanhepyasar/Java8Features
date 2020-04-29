package javaeight.d.streamapi.c.methods.c.numericstreams;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MapToObjLongDoubleExample {
	public static void main(final String[] args) {
		final List<RandomIds> randomIds = IntStream.rangeClosed(0, 5)
				.mapToObj((i) -> {
					return new RandomIds(i, ThreadLocalRandom.current().nextInt(100));
				}).collect(Collectors.toList());

		randomIds.forEach(System.out::println);
		System.out.println("------------");

		final LongStream longStream = IntStream.rangeClosed(0, 5).mapToLong(i -> (long) i);
		longStream.forEach(System.out::println);
		System.out.println("------------");

		final DoubleStream doubleStream = LongStream.rangeClosed(0, 5).mapToDouble(i -> (double) i);
		doubleStream.forEach(System.out::println);
	}
}

class RandomIds {
	int id;
	int randomNumbers;

	public RandomIds(final int id, final int randomNumbers) {
		this.id = id;
		this.randomNumbers = randomNumbers;
	}

	@Override
	public String toString() {
		return "RandomIds{" +
				"id=" + id +
				", randomNumbers=" + randomNumbers +
				'}';
	}
}
