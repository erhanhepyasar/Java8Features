package javaeight.d.collectionsandstreamapi.a.intro;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ImperativeDeclarative {

	public static void main(final String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

		// 1. Imperative (Uses external iterators)
		for (int i = 0; i < friends.size(); i++) {
			System.out.println(friends.get(i));
		}

		System.out.println("---------------------");

		// 2. Imperative
		for (final String name : friends) {
			System.out.println(name);
		}

		System.out.println("---------------------");

		// 3. Declarative (Uses internal iterators)
		// passed an anonymous instance of Consumer Interface to forEach() method.
		friends.forEach(new Consumer<String>() {
			@Override
			public void accept(final String name) {
				System.out.println(name);
			}
		});

		System.out.println("---------------------");

		// 4. Declarative
		// passed a lambda expression as Consumer Interface
		friends.forEach(name -> System.out.println(name));

		System.out.println("---------------------");

		// 5. Declarative
		// passed a method reference as Consumer Interface
		friends.forEach(System.out::println);

	}

}
