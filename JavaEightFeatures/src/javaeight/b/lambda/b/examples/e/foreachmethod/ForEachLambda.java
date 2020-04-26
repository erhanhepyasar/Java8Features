package javaeight.b.lambda.b.examples.e.foreachmethod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer; // Consumer Interface

class ConsumerImpl implements Consumer<Integer> {

	@Override
	public void accept(final Integer i) {
		System.out.println(i);
	}

}

public class ForEachLambda {

	public static void main(final String[] args) {

		final List<Integer> numbers = new ArrayList<>();

		// External loop
		for (int i = 1; i <= 100; i++) {
			numbers.add(i);
		}

		// Internal loop -> Much faster, suitable for big data
		numbers.forEach(number -> {

			if (number % 10 == 0) {
				System.out.println(number);
			}

		});

		// Lambda // Consumer Interface
		numbers.forEach(i -> System.out.println(i));

	}

}
