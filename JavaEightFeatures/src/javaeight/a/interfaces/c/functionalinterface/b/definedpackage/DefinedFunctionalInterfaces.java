package javaeight.a.interfaces.c.functionalinterface.b.definedpackage;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

public class DefinedFunctionalInterfaces {

	@SuppressWarnings("unused")
	public static void main(final String[] args) {

		final Runnable runnable; // java.lang;
		final Comparator<Integer> comparator; // java.util;

		// java.util.function package
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
