package enumeration.ex2;

/**
 * 타입 안전 열거형 패턴의 한계
 *
 * 장점
 * 타입 안정성 향상 - 정해진 객체만 사용할 수 있기 때문에, 잘못된 값을 입력하는 문제를 근본적으로 방지할 수 있다.
 * 데이터 일관성 - 정해진 객체만 사용하므로 데이터의 일관성이 보장된다.
 *
 * 단점
 * 많은 상수 코드를 작성해야 한다.
 * private 생성자를 추가하는 등 유의해야 하는 부분들이 발생한다.
 */
public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
//        ClassGrade newClassGrade = new ClassGrade();
//        int result = discountService.discount(newClassGrade, price);
//        System.out.println("newClassGrade 등급의 할인 금액 = " + result);
    }
}
