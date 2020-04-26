package javaeight.c.methodreference.c.constructorreference;

import java.util.Arrays;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.InstructorFactory;

public class ConstructorReference2 {
	public static void main(final String[] args) {

		final InstructorFactory instructorFactory = Instructor::new;

		final Instructor instructor = instructorFactory.getInstructor("Mike", 10, "Software Developer", "M", true,
				Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));

		System.out.println(instructor);
	}
}
