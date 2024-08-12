package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 다형성 시도
 *
 * 코드 재사용 O
 *  - 다형성을 통해 AnimalHospital2 하나로 강아지와 고양이를 모두 처리한다.
 *
 * 타입 안전성 X
 *  - 강아지 병원에 고양이를 전달하는 문제가 발생한다.
 *  - Animal 타입을 반환하기 때문에 다운 캐스팅을 해야 한다.
 *  - 실수로 고양이를 입력했는데, 강아지를 반환하는 상황이라면 캐스팅 예외가 발생한다.
 */
public class AnimalHospitalMain2 {
    public static void main(String[] args) {
        AnimalHospital1 dogHospital = new AnimalHospital1();
        AnimalHospital1 catHospital = new AnimalHospital1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 강아지 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 강아지 병원에 고양이 전달
        dogHospital.set(cat); // 매개변수 체크 실패: 컴파일 오류가 발생하지 않음

        // 문제2: 강아지 타입 반환, 캐스팅 필요
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
