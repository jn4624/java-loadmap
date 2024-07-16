package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        // 모든 Enum 반환
        Grade[] values = Grade.values();
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));

        System.out.println();

        for (Grade value : values) {
            System.out.println("value.name() = " + value.name());

            /**
             * ordinal()은 가급적 사용하지 않는 것이 좋다.
             * 값을 사용하다 중간에 상수를 선언하는 위치가 변경되면 전체 상수의 위치가 모두 변경될 수 있기 때문.
             */
            System.out.println("value.ordinal() = " + value.ordinal()); // 순서
        }

        System.out.println();

        /**
         * String -> Enum 변환
         * 잘못된 문자가 입력되면 IllegalArgumentException 발생
         */
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); // toString() 직접 오버라이딩 해서 사용 가능
    }
}
