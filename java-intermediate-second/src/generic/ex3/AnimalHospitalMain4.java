package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 제네릭 도입과 타입 매개변수 제한
 *
 * 타입 안전성 X 문제
 *  - 강아지 병원에 고양이를 전달하는 문제 발생 -> 해결
 *  - Animal 타입을 반환하기 때문에 다운 캐스팅 발생 -> 해결
 *  - 실수로 고양이를 입력했는데, 개를 반환하는 상황이라면 캐스팅 예외 발생 -> 해결
 *
 * 제네릭 도입 문제
 *  - 제네릭에서 타입 매개변수를 사용하면 어떤 타입이든 수용 -> 해결
 *  - 어떤 타입이든 수용할 수 있는 Object 객체로 가정하고, Object 기능만 사용 -> 해결
 */
public class AnimalHospitalMain4 {
    public static void main(String[] args) {
        AnimalHospital3<Dog> dogHospital = new AnimalHospital3<>();
        AnimalHospital3<Cat> catHospital = new AnimalHospital3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 강아지 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 강아지 병원에 고양이 전달
//        dogHospital.set(cat); // 다른 타입 입력: 컴파일 오류

        // 문제2: 강아지 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
