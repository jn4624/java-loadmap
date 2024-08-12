package generic.ex4;

import generic.animal.Animal;

/**
 * 제네릭 타입과 제네릭 메서드의 우선순위
 *  - 제네릭 메서드가 높은 우선 순위를 가진다.
 *  - 여기서 적용된 제네릭 메서드의 타입 매개변수 T 는 상한이 없다. 따라서 Object 로 취급된다.
 *    Object 로 취급되기 때문에 t.getName() 과 같은 Animal 에 존재하는 메서드는 호출할 수 없다.
 *  - 참고로 프로그래밍에서 모호한 것은 좋지 않다.
 *    둘의 이름이 겹치면 둘 중 하나를 다른 이름으로 변경하는 것이 좋다.
 */
public class ComplexBox<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T t) {
        System.out.println("animal.className = " + animal.getClass().getName());
        System.out.println("t.className = " + t.getClass().getName());

        /**
         * 호출 불가
         * 메서드는 <T extends Animal> 타입이 아닌 <T> 타입이다.
         * 따라서 메서드는 Object 로 취급되기 때문에 Animal 제공 메서드는 호출할 수 없다.
         */
//        t.getName();

        return t;
    }
}
