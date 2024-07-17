package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime nowZonedDateTime = ZonedDateTime.now();
        System.out.println("nowZonedDateTime = " + nowZonedDateTime);

        LocalDateTime localDateTime = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime1 = " + zonedDateTime1);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime2 = " + zonedDateTime2);

        ZonedDateTime utcZonedDateTime = zonedDateTime2.withZoneSameInstant(ZoneId.of("UTC")); // 타임존을 변경한다.
        System.out.println("utcZonedDateTime = " + utcZonedDateTime);
    }
}
