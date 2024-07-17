package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime ofDateTime = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("현재 날짜 시간 = " + nowDateTime);
        System.out.println("지정 날짜 시간 = " + ofDateTime);

        // 날짜와 시간 분리
        LocalDate ofDate = ofDateTime.toLocalDate();
        LocalTime ofTime = ofDateTime.toLocalTime();
        System.out.println("ofDate = " + ofDate);
        System.out.println("ofTime = " + ofTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(ofDate, ofTime);
        System.out.println("localDateTime = " + localDateTime);

        // 계산 (불변)
        LocalDateTime plusDays = ofDateTime.plusDays(1000);
        System.out.println("지정 날짜 시간 + 1000d = " + plusDays);

        LocalDateTime plusYears = ofDateTime.plusYears(1);
        System.out.println("지정 날짜 시간 + 1y = " + plusYears);

        // 비교
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가? " + nowDateTime.isBefore(ofDateTime));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가? " + nowDateTime.isAfter(ofDateTime));
        System.out.println("현재 날짜 시간과 지정 날짜 시간이 같은가? " + nowDateTime.isEqual(ofDateTime));
    }
}
