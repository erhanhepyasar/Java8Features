package javaeight.c.methodreference.a.staticmethodreference;

import java.util.function.Function;

public class StaticMethodReference {
	@SuppressWarnings("unused")
	public static void main(final String[] args) {

		// Math
		final Function<Integer, Double> sqrt1 = a -> Math.sqrt(a);
		final Function<Integer, Double> sqrt2 = Math::sqrt;
		System.out.println(sqrt1.apply(25));
		System.out.println(sqrt2.apply(36));

		// parseInt
		final Function<String, Integer> lambdaFunction = s -> Integer.parseInt(s);
		final Function<String, Integer> referenceFunction = Integer::parseInt;
		System.out.println(lambdaFunction.apply("55"));
		System.out.println(lambdaFunction.apply("80"));

	}
}
