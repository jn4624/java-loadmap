package poly.basic;

/**
 * 다형적 참조: 부모는 자식을 품을 수 있다.
 */
public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent1 = new Parent();
        parent1.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child1 = new Child();
        child1.parentMethod();
        child1.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent parent2 = new Child();
        parent2.parentMethod();
//        parent2.childMethod(); // 자식의 기능은 호출할 수 없다.

//        Child child2 = new Parent(); // 자식은 부모를 담을 수 없다.
    }
}
