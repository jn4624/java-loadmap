package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 제네릭 도입과 실패 문제2
 *  - 제네릭 도입으로 Integer, Object 와 같은 동물과 전혀 관계 없는 타입을 타입 인자로 전달할 수 있다.
 *  - 우리는 최소한 Animal 이나 그 자식의 타입 인자로 제한하고 싶다.
 */
public class AnimalHospitalMain3 {
    public static void main(String[] args) {
        AnimalHospital2<Dog> dogHospital = new AnimalHospital2<>();
        AnimalHospital2<Cat> catHospital = new AnimalHospital2<>();
        AnimalHospital2<Integer> integerHospital = new AnimalHospital2<>();
        AnimalHospital2<Object> objectHospital = new AnimalHospital2<>();
    }
}
