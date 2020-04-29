package javaeight.d.streamapi.a.intro;

import java.util.Arrays;
import java.util.List;

public class PrintList {

	public static void main(final String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

		// a. Loop (Old way)
		for (int i = 0; i < friends.size(); i++) {
			System.out.println(friends.get(i));
		}

		System.out.println("---------------------");

		// b. Stream
		friends.forEach(name -> System.out.println(name));
		System.out.println("---------------------");
		friends.forEach(System.out::println);

	}

}
