package generic.ex5;

import generic.animal.Animal;

/**
 * 와일드카드
 *  - 와일드카드는 제네릭 타입이나, 제네릭 메서드를 선언하는 것이 아니다.
 *  - 와일드카드는 이미 만들어진 제네릭 타입을 활용할 때 사용한다.
 *  - 예로 이미 만들어진 제네릭 타입 Box<T>를 활용해서 메서드를 구현하였다.
 */
public class WildcardEx {
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
