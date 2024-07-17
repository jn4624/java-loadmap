package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now();// UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime nowZonedDateTime = ZonedDateTime.now();
        /**
         * 다른 타입의 날짜와 시간을 기준으로 Instant를 생성한다.
         * Instant는 UTC를 기준으로 하기 때문에 시간대 정보가 필요하다.
         * 따라서 LocalDateTime은 사용할 수 없다.
         */
        Instant from = Instant.from(nowZonedDateTime);
        System.out.println("from = " + from);

        /**
         * 에포크 시간을 기준으로 Instant를 생성한다.
         * 0초를 선택하면 에포크 시간인 1970년 1월 1일 0시 0분 0초로 생성된다.
         */
        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        // 조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }

    /**
     * 기계 중신의 시간 - Instant
     * Instant는 UTC를 기준으로 하는, 시간의 한 지점을 나타낸다.
     * Instant는 날짜와 시간을 나노초 정밀도로 표현하며, 1970년 1월 1일 0시 0분 0초를 기준으로 경과한 시간으로 계산된다.
     *
     * 장점
     * 시간대 독립성 - Instant는 UTC를 기준으로 하므로, 시간대에 영향을 받지 않는다.
     *              이는 전 세계 어디서나 동일한 시점을 가리키는데 유용하다.
     * 고정된 기준점 - 모든 Instant는 1970년 1월 1일 UTC를 기준으로 하기 때문에, 시간 계산 및 비교가 명확하고 일관된다.
     *
     * 단점
     * 사용자 친화적이지 않음 - Instant는 기계적인 시간 처리에는 적합하지만, 사람이 읽고 이해하기에는 직관적이지 않다.
     * 시간대 정보 부재 - Instant에는 시간대 정보가 포함되어 있지 않아, 특정 지역의 날짜와 시간으로 변환하려면 추가적인 작업이 필요하다.
     *
     * 사용 예
     * 전 세계적인 시간 기준 필요시 - Instant는 UTC를 기준으로 하므로, 전 세계적으로 일관된 시점을 표현할 때 사용하기 좋다.
     *                           예를 들어 로그 기록이나, 트랜잭션 타임스태프, 서버 간의 시간 동기화 등이 이에 해당한다.
     * 시간대 변환 없이 시간 계산 필요시 - 시간대의 변화 없이 순수하게 시간의 흐름만을 다루고 싶을 때 Instant가 적합하다.
     *                               이는 시간대 변환의 복잡성 없이 시간 계산을 할 수 있게 해준다.
     * 데이터 저장 및 교환 - 데이터베이스에 날짜와 시간 정보를 저장하거나, 다른 시스템과 날짜와 시간 정보를 교환할 때 Instant를 사용하면
     *                    모든 시스템에서 동일한 기준점(UTC)을 사용하게 되므로 데이터의 일관성을 유지하기 쉽다.
     */
}
