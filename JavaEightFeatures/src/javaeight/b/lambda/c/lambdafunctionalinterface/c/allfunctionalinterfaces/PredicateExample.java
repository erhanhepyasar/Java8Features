package javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(final String[] args) {
		// if number is >10 return true other false
		final Predicate<Integer> p1 = (i) -> i > 10;
		System.out.println(p1.test(100));

		// i>10 && number is even number (i%2 ==0)
		final Predicate<Integer> p2 = (i) -> i % 2 == 0;
		System.out.println(p1.and(p2).test(20));

		// i>10 || number is even number (i%2==0)
		System.out.println(p1.or(p2).test(4));

		// i>10 && i%2 !=0
		System.out.println(p1.and(p2.negate()).test(33));

	}
}
