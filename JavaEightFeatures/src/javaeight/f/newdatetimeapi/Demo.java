package javaeight.f.newdatetimeapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Demo {

	public static void main(final String[] args) {

		// Local date (not time)
		LocalDate d = LocalDate.now();
		System.out.println(d);

		d = LocalDate.of(1990, Month.APRIL, 21); // Define date
//		d = LocalDate.of(1989, Month.FEBRUARY, 29); // Invalid date 'February 29' as '1989' is not a leap year
		System.out.println(d);

		// Local time
		LocalTime t = LocalTime.now();
		t = LocalTime.of(14, 30, 5); // Define time
		System.out.println(t);

		// Local Date-Time
		final LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

//		ZoneId.getAvailableZoneIds().forEach(System.out::println)
//		ZoneId.getAvailableZoneIds().stream().sorted().forEach(System.out::println);

		// Instant
		final Instant instant = Instant.now();
		System.out.println(instant);

	}

}
