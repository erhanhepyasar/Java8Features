package javaeight.d.streams.e.parallelstream;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class StreamPerformanceExample1 {
	static long tokenCount = 50000;

	public static void main(final String[] args) {
		final int loop = 20;
		long result = measurePerformance(StreamPerformanceExample1::sortSequentialStream, loop);
		System.out.println("Time taken to process sort in sequential: " + result + " msecs");
		result = measurePerformance(StreamPerformanceExample1::sortParallelStream, loop);
		System.out.println("Time taken to process sort in parallel: " + result + "msecs");

	}

	public static long measurePerformance(final Supplier<Long> supplier, final int numberofTimes) {
		final long startTime = System.currentTimeMillis();
		for (int i = 0; i < numberofTimes; i++)
			supplier.get();
		return System.currentTimeMillis() - startTime;
	}

	public static long sortSequentialStream() {
		final List<RandomTokens> randomTokens = LongStream.rangeClosed(0, tokenCount)
				.mapToObj((i) -> {
					return new RandomTokens(i, ThreadLocalRandom.current()
							.nextLong(tokenCount));
				}).collect(Collectors.toList());
		randomTokens.stream().sorted(Comparator.comparing(RandomTokens::getTokens));
		return -1;

	}

	public static long sortParallelStream() {
		final List<RandomTokens> randomTokens = LongStream.rangeClosed(0, tokenCount)
				.parallel().mapToObj((i) -> {
					return new RandomTokens(i, ThreadLocalRandom.current()
							.nextLong(tokenCount));
				}).collect(Collectors.toList());
		randomTokens.stream().parallel().sorted(Comparator.comparing(RandomTokens::getTokens));
		return -1;
	}
}

class RandomTokens {
	long id;
	long tokens;

	public RandomTokens(final long id, final long tokens) {
		this.id = id;
		this.tokens = tokens;
	}

	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public long getTokens() {
		return tokens;
	}

	public void setTokens(final long tokens) {
		this.tokens = tokens;
	}
}
