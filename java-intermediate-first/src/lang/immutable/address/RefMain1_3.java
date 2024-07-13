package lang.immutable.address;

/**
 * 여러 변수가 하나의 객체를 공유하는 것을 막을 방법은 없다.
 * 실제로는 훨씬 더 복잡한 상황에서 이런 문제가 발생한다.
 */
public class RefMain1_3 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소값을 변경합니다 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
