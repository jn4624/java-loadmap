package poly.basic;

/**
 * 다운 캐스팅을 자동으로 하지 않는 이유
 */
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제 없음

        /**
         * new Parent() -> 메모리 상에 자식 타입은 전혀 존재하지 않는다.
         * (Child) parent2 -> parent2는 Parent 로 생성되어 메모리 상에 Child 자체가
         *                    존재하지 않으므로 Child 자체를 사용할 수 없다.
         */
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 런타임 오류 (ClassCastException)
        child2.childMethod(); // 실행 불가
    }

    /**
     * 업 캐스팅이 안전하고 다운 캐스팅이 위험한 이유
     * 업 캐스팅은 객체를 생성하면 해당 타입의 상위 부모 타입이 함께 생성되기 때문에
     * 다운 캐스팅의 인스턴스에 존재하지 않는 하위 타입으로 캐스팅하는 문제가 발생하지 않는다.
     */
}
