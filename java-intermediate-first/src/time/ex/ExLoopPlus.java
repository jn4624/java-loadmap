package time.ex;

import java.time.LocalDate;

public class ExLoopPlus {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 1, 1);

        for (int i = 1; i <= 5; i++) {
            System.out.println("날짜 " + i + ": " + localDate);
            localDate = localDate.plusWeeks(2);
        }
    }
}
