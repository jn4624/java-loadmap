package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime nowOffsetDateTime = OffsetDateTime.now();
        System.out.println("nowOffsetDateTime = " + nowOffsetDateTime);

        LocalDateTime localDateTime = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println("localDateTime = " + localDateTime);

        /**
         * ZoneOffSet은 +01:00처럼 UTC와의 시간 차이인 오프셋 정보만 보관한다.
         */
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.of("+01:00"));
        System.out.println("offsetDateTime = " + offsetDateTime);
    }

    /**
     * ZonedDateTime vs OffsetDateTime
     * 1. ZonedDateTime은 구체적인 지역 시간대를 다룰 때 사용하며, 일광 절약 시간을 자동으로 처리할 수 있다.
     *    사용자 지정 시간대에 따른 시간 계산이 필요할 때 적합하다.
     * 2. OffSetDateTime은 UTC와의 시간 차이만을 나타낼 때 사용하며, 지역 시간대의 복잡성을 고려하지 않는다.
     *    시간대 변환 없이 로그를 기록하고, 데이터를 저장하고 처리할 때 적합하다.
     */
}
