package lang.wrapper;

/**
 * Integer.valueOf()에는 성능 최적화 기능이 있다.
 * 개발자들이 일반적으로 자주 사용하는 -128 ~ 127 범위의 Integer 클래스를 미리 생성해준다.
 * 해당 범위의 값을 조회하면 미리 생성된 Integer 객체를 반환한다.
 * 해당 범위의 값이 없으면 new Integer()를 호출한다.
 *
 * 마치 문자열 풀과 비슷하게 자주 사용하는 숫자를 미리 생성해두고 재사용한다.
 * 참고로 이런 최적화 방식은 미래에 더 나은 방식으로 변경될 수 있다.
 */
public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제될 예정, 대신 valueOf()를 사용하자
        Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println();

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println();

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals: " + newInteger.equals(integerObj));
    }
}
