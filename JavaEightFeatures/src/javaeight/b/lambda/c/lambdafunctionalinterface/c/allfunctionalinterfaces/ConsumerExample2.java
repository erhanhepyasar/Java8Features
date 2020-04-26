package javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces;

import java.util.List;
import java.util.function.Consumer;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class ConsumerExample2 {
	public static void main(final String[] args) {
		final List<Instructor> instructors = Instructors.getAll();
		// looping through all the instructor and printing out the values of instructor
		final Consumer<Instructor> c1 = (s1) -> System.out.println(s1);
		instructors.forEach(c1);

		// Loop through all the instructor and only print out their name
		System.out.println("---------------");
		final Consumer<Instructor> c2 = (s1) -> System.out.print(s1.getName());
		instructors.forEach(c2);

		// Loop through all the instructors and print out their names and their courses
		System.out.println("----------------");
		final Consumer<Instructor> c3 = (s1) -> System.out.println(s1.getCourses());
		instructors.forEach(c2.andThen(c3));

		// Loop through all the instructors and print out their name if the years of experience is >10
		System.out.println("----------");
		instructors.forEach(s1 -> {
			if (s1.getYearsOfExperience() > 10) {
				c1.accept(s1);
			}
		});

		// Loop through all the instructors and print out their name and years of experience if years
		// of experience is >5 and teaches course online
		System.out.println("--------------");
		instructors.forEach(s1 -> {
			if (s1.getYearsOfExperience() > 5 && !s1.isOnlineCourses()) {
				c1.andThen(c2).accept(s1);
			}
		});

	}
}
