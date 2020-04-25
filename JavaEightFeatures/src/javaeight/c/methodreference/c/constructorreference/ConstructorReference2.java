package javaeight.c.methodreference.c.constructorreference;

import java.util.Arrays;

import javaeight.a.interfaces.c.functionalinterface.c.examples.instructor.Instructor;
import javaeight.a.interfaces.c.functionalinterface.c.examples.instructor.InstructorFactory;

public class ConstructorReference2 {
	public static void main(final String[] args) {

		final InstructorFactory instructorFactory = Instructor::new;

		final Instructor instructor = instructorFactory.getInstructor("Mike", 10, "Software Developer", "M", true,
				Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));

		System.out.println(instructor);
	}
}
