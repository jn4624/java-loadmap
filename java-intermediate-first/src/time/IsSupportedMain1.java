package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * LocalDate는 날짜 정보만 가지고 있고, 시간에 대한 정보는 없다.
 * 따라서 분에 대한 정보를 조회하려고 하면 예외가 발생한다.
 *
 * 이런 문제를 예방하기 위해 TemporalAccessor와 Temporal 인터페이스는
 * 현재 타입에서 특정 시간 단위나 필드를 사용할 수 있는지 확인할 수 있는 메서드를 제공한다.
 */
public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("minute = " + minute);
    }
}
