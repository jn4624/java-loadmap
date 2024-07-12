package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("ModelY");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString() 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println();

        System.out.println("2. println 내부에서 toString() 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println();

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        /**
         * toString()은 기본적으로 객체의 참조값을 출력하는데
         * toString()이나 hashCode()를 재정의하면 참조값을 출력할 수 없다.
         * 이때는, 아래와 같이 출력해야 한다.
         */
        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = " + refValue);
    }
}
