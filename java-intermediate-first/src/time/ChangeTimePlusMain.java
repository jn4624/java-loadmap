package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime plusDateTime1 = localDateTime.plus(10, ChronoUnit.YEARS);
        System.out.println("plusDateTime1 = " + plusDateTime1);

        LocalDateTime plusDateTime2 = localDateTime.plusYears(10);
        System.out.println("plusDateTime2 = " + plusDateTime2);

        Period period = Period.ofYears(10);
        LocalDateTime plusDateTime3 = localDateTime.plus(period);
        System.out.println("plusDateTime3 = " + plusDateTime3);
    }
}
