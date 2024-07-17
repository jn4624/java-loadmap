package time;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Duration
 * 두 시간 사이의 간격을 시, 분, 초(나노초) 단위로 나타낸다.
 */
public class DurationMain {
    public static void main(String[] args) {
        // 생성
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime localTime = LocalTime.of(1, 0);
        System.out.println("기준 시간 = " + localTime);

        // 계산에 사용
        LocalTime plusTime = localTime.plus(duration);
        System.out.println("더한 시간 = " + plusTime);

        // 시간 차이
        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(10, 0);
        Duration between = Duration.between(startTime, endTime);
        System.out.println("차이 = " + between.getSeconds() + "초");
        System.out.println("근무 시간 = " + between.toHours() + "시간 " + between.toMinutesPart() + "분");
    }
}
