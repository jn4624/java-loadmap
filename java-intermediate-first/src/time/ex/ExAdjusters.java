package time.ex;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class ExAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate localDate = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = localDate.getDayOfWeek();
        DayOfWeek lastDayOfWeek = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("firstDayOfWeek: " + firstDayOfWeek);
        System.out.println("lastDayOfWeek: " + lastDayOfWeek);
    }
}
