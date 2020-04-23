package javaeight.a.interfaces.c.functionalinterface;

import java.util.Comparator;
import java.util.function.*;

public class DefinedFunctionalInterfaces {

	@SuppressWarnings("unused")
	public static void main(final String[] args) {

		final Runnable runnable; // java.lang;
		final Comparator<Integer> comparator; // java.util;

//	java.util.function package
		// Predicate
		final Predicate<Integer> predicate;
		final IntPredicate intPredicate;
		final LongPredicate longPredicate;
		final DoublePredicate doublePredicate;
		final BiPredicate<Integer, Integer> biPredicate;

		// Consumer
		final Consumer<String> consumer;
		final IntConsumer intConsumer;
		final LongConsumer longConsumer;
		final DoubleConsumer doubleConsumer;
		final BiConsumer<Integer, Integer> biConsumer;

		// Supplier
		final Supplier<String> supplier;
		final BooleanSupplier booleanSupplier;
		final IntSupplier intSupplier;
		final LongSupplier longSupplier;
		final DoubleSupplier doubleSupplier;

		// Function
		final Function<Integer, Integer> function;
		final IntFunction<Integer> intFunction;
		final LongFunction<String> longFunction;
		final DoubleFunction<Boolean> doubleFunction;
		final ToIntFunction<Integer> toIntFunction;
		final ToLongFunction<Integer> toLongFunction;
		final ToDoubleFunction<Integer> toDoubleFunction;
		final IntToLongFunction intToLongFunction;
		final IntToDoubleFunction intToDoubleFunction;
		final LongToDoubleFunction longToDoubleFunction;
		final LongToIntFunction longToIntFunction;
		final DoubleToIntFunction doubleToIntFunction;
		final DoubleToLongFunction doubleToLongFunction;

		final BiFunction<Integer, Integer, Integer> biFunction;
		final ToIntBiFunction<Integer, Integer> toIntBiFunction;
		final ToLongBiFunction<Integer, Integer> toLongBiFunction;
		final ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction;

		final UnaryOperator<Integer> unaryOperator;
		final IntUnaryOperator intUnaryOperator;
		final LongUnaryOperator longUnaryOperator;
		final DoubleUnaryOperator doubleUnaryOperator;

		final BinaryOperator<Integer> binaryOperator;
		final IntBinaryOperator intBinaryOperator;
		final LongBinaryOperator longBinaryOperator;
		final DoubleBinaryOperator doubleBinaryOperator; 

	}

}
