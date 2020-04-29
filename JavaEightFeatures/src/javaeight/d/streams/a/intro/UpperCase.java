package javaeight.d.streams.a.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperCase {

	public static void main(final String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

		// a. Loop (Old way)
		final List<String> uppercaseNames = new ArrayList<>();
		for (final String name : friends) {
			uppercaseNames.add(name.toUpperCase());
		}

		System.out.println(uppercaseNames);

		// b. Stream
		friends.stream()
				.map(name -> name.toUpperCase())
//				.map(String::toUpperCase)
				.forEach(name -> System.out.println(name));

	}

}
