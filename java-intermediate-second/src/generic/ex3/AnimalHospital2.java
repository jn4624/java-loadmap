package generic.ex3;

/**
 * 제네릭 도입과 실패 문제1
 *  - 자바 컴파일러 입장에서 T에 어떤 값이 들어올지 예측 불가능하다.
 *  - 따라서 자바 컴파일러는 T를 어떤 타입이든 받을 수 있는 모든 객체의 최종 부모인 Object 타입으로 가정한다.
 *  - 따라서 Object 제공 메서드만 호출 가능하다.
 *  - 원하는 기능을 사용하려면 Animal 타입이 제공하는 기능들이 필요한데 이 기능을 사용할 수 없다.
 */
public class AnimalHospital2<T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        /**
         * T의 타입을 메서드를 정의하는 시점에는 알 수 없다.
         * Object 기능만 사용 가능
         */
        animal.toString();
        animal.equals(null);

        // 컴파일 오류
//        System.out.println("동물 이름 = " + animal.getName());
//        System.out.println("동물 크기 = " + animal.getSize());
//        animal.sound();
    }

    public T getBigger(T target) {
        return null;

        // 컴파일 오류
//        return animal.getSize() > target.getSize() ? animal : target;
    }
}
