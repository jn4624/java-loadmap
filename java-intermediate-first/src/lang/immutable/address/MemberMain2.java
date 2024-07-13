package lang.immutable.address;

/**
 * 불변 객체 사용
 */
public class MemberMain2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        Member2 memberA = new Member2("memberA", address);
        Member2 memberB = new Member2("memberB", address);

        // memberA memberB의 처음 주소는 모두 동일
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // memberB의 주소를 부산으로 변경해야함
//        memberB.getAddress().setValue("부산"); // 컴파일 오류
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
