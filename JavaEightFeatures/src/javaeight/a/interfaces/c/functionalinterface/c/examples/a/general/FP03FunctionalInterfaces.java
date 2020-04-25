package javaeight.a.interfaces.c.functionalinterface.c.examples.a.general;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {

	/*
	 * 
	 * boolean isEven(int x) {
	 * return x%2==0;
	 * }
	 * 
	 * int squared(int x) {
	 * return x * x;
	 * }
	 * 
	 */

	@SuppressWarnings("unused")
	public static void main(final String[] args) {

		final List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		final Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

		final Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
			@Override
			public boolean test(final Integer x) {
				return x % 2 == 0;
			}

		};

		final Function<Integer, Integer> squareFunction = x -> x * x;

		final Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {
			@Override
			public Integer apply(final Integer x) {
				return x * x;
			}

		};

		final Consumer<Integer> sysoutConsumer = System.out::println;

		final Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
			@Override
			public void accept(final Integer x) {
				System.out.println(x);
			}
		};

		numbers.stream()
				.filter(isEvenPredicate2)
				.map(squareFunction2)
				.forEach(sysoutConsumer2);

		final BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
		// BinaryOperator<Integer> sumBinaryOperator = (x,y) => x + y;

		final BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(final Integer a, final Integer b) {
				// TODO Auto-generated method stub
				return a + b;
			}

		};

		final int sum = numbers.stream()
				.reduce(0, sumBinaryOperator);
	}
}
