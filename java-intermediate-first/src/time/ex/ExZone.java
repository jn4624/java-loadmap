package time.ex;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExZone {
    public static void main(String[] args) {
        ZonedDateTime koreaDateTime = ZonedDateTime.of(2024, 1, 1, 9, 0, 0, 0, ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonDateTime = koreaDateTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYorkDateTime = koreaDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간: " + koreaDateTime);
        System.out.println("런던의 회의 시간: " + londonDateTime);
        System.out.println("뉴욕의 회의 시간: " + newYorkDateTime);
    }
}
