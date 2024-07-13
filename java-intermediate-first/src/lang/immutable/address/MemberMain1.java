package lang.immutable.address;

/**
 * 가변 객체 사용
 */
public class MemberMain1 {
    public static void main(String[] args) {
        Address address = new Address("서울");

        Member1 memberA = new Member1("memberA", address);
        Member1 memberB = new Member1("memberB", address);

        // memberA memberB의 처음 주소는 모두 동일
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // memberB의 주소를 부산으로 변경해야함
        memberB.getAddress().setValue("부산");
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
