package javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor;

import java.util.Arrays;
import java.util.List;

public class Instructors {

	private Instructors() {

	}

	public static List<Instructor> getAll() {
		final Instructor instructor1 = new Instructor("Mike", 10, "Software Developer", "M", true,
				Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));

		final Instructor instructor2 = new Instructor("Jenny", 5, "Engineer", "F", false,
				Arrays.asList("Multi-Threaded Programming", "CI/CD", "Unit Testing"));

		final Instructor instructor3 = new Instructor("Gene", 6, "Manager", "M", false,
				Arrays.asList("C++ Programming", "C Programming", "React Native"));

		final Instructor instructor4 = new Instructor("Anthony", 15, "Senior Developer", "M", true,
				Arrays.asList("Java Programming", "Angular Programming", "React Native"));

		final Instructor instructor5 = new Instructor("Syed", 15, "Principal Engineer", "M", true,
				Arrays.asList("Java Programming", "Java Multi-Threaded Programming", "React Native"));

		final List<Instructor> list = Arrays.asList(instructor1, instructor2, instructor3, instructor4, instructor5);
		return list;

	}
}
