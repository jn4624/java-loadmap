package poly.overriding;

/**
 * 다형성과 메서드 오버라이딩
 * 오버라이딩 된 메서드가 항상 우선권을 가진다.
 */
public class OverridingMain {
    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); // 변수는 오버라이딩 되지 않는다.
        poly.method(); // 메서드는 오버라이딩 된다.

        /**
         * poly 변수는 Parent 타입으로 poly.value, poly.method()를 호출하면
         * 인스턴스의 Parent 타입에서 기능을 찾아서 실행한다.
         * poly.value - Parent 타입에 있는 value 값을 읽는다.
         *
         * poly.method() - Parent 타입에 있는 method() 를 실행하려고 한다.
         * 그런데 하위 타입인 Child.method() 가 오버라이딩 되어 있다.
         * -> 오버라이딩 된 메서드는 항상 우선권을 가진다.
         * -> 따라서 Parent.method() 가 아니라 Child.method()가 실행된다.
         */
    }
}
