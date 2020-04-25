package javaeight.d.collectionsandstreamapi.b.transformingalist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperCase {

	public static void main(final String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

		// 1. Imperative
		final List<String> uppercaseNames = new ArrayList<>();
		for (final String name : friends) {
			uppercaseNames.add(name.toUpperCase());
		}

		System.out.println(uppercaseNames);

		// 2. Declarative - Lambda
		friends.stream()
				.map(name -> name.toUpperCase())
				.forEach(name -> System.out.println(name));

		System.out.println("---------------------");

		// 3. Declarative - Method Reference
		friends.stream()
				.map(String::toUpperCase)
				.forEach(System.out::println);

		System.out.println("---------------------");

		// 4. Declarative - Method Reference - Count letters
		friends.stream()
				.map(String::length)
				.forEach(System.out::println);

	}

}
