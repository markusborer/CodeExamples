package ch.adesso.examples.localdatetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		System.out.println("D1");
		LocalDateTime d1 = LocalDateTime.now();
        System.out.println(d1);
        System.out.println(d1.plus(2, ChronoUnit.HOURS));
        System.out.println(d1);

        System.out.println("");
		System.out.println("D2");
        LocalDateTime d2 = LocalDateTime.of(2017, 1, 31, 12, 00);
        System.out.println(d2);
        System.out.println(d2.plus(1, ChronoUnit.MONTHS));
        System.out.println(d2.plus(2, ChronoUnit.MONTHS));
        System.out.println(d2.plus(3, ChronoUnit.MONTHS));
	}

}
