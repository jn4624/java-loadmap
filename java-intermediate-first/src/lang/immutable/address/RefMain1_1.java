package lang.immutable.address;

/**
 * 참조형 예제
 */
public class RefMain1_1 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a); // 사이드 이펙트 발생
        System.out.println("b = " + b);

        /**
         * 사이드 이펙트란?
         * 주된 작업 외에 추가적인 부수 효과를 일으키는 것을 사이드 이펙트라 한다.
         * 프로그래밍에서 사이드 이펙트는 보통 부정적인 의미로 사용되는데,
         * 사이드 이펙트는 프로그램의 특정 부분에서 발생한 변경이 의도치 않게 다른 부분에 영향을 미치는 경우에 발생한다.
         * 이로 인해 디버깅이 어려워지고 코드의 안정성이 저하될 수 있다.
         */
    }
}
