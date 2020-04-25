package javaeight.d.collectionsandstreamapi;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(final String[] args) {
		final List<Integer> numbers = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			numbers.add(i);
		}

		numbers.forEach(number -> System.out.println(number));
		numbers.forEach(System.out::println);

		numbers.stream().forEach(System.out::println);

		// Automatically create multiple threads.
		numbers.parallelStream().forEach(System.out::println);

	}

}
