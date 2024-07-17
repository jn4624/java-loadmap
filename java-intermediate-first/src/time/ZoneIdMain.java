package time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault(); // 시스템이 사용하는 기본 ZoneId를 반환
        System.out.println("zoneId = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul"); // 타임존을 직접 제공해서 ZoneId를 반환
        System.out.println("seoulZoneId = " + seoulZoneId);

        /**
         * ZoneId는 내부에 일광 절약 시간 관련 정보, UTC와의 오프셋 정보를 포함하고 있다.
         */
    }
}
