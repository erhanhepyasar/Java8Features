package javaeight.d.streamapi.b.basicexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicStreamExamples {

	public static void main(final String[] args) {

		// Square numbers and collect to a list
		final List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);
		final List<Integer> squaredNumbers = numbers.stream()
				.map(x -> x * x)
				.collect(Collectors.toList());

		System.out.println(squaredNumbers);

		// Filter names and collect to a list
		final List<String> names = Arrays.asList("Syed", "Mike", "Jenny", "Rajeev");
		final List<String> namesWithJ = names.stream()
				.filter(name -> name.startsWith("J"))
				.collect(Collectors.toList());

		System.out.println(namesWithJ);

		// Sort names and collect to a list
		final List<String> namesSorted = names.stream()
				.sorted()
				.collect(Collectors.toList());

		System.out.println(namesSorted);

		// Sort names and print
		names.stream()
				.sorted()
				.forEach(name -> System.out.println(name));
//				.forEach(System.out::println);

		// calculate sum of numbers
		final Integer sum = numbers.stream()
				.reduce(0, (a, b) -> a + b);

		System.out.println(sum);

	}

}
