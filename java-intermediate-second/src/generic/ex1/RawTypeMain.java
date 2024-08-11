package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        /**
         * 타입 인자를 지정해주지 않을 경우
         * GenericBox<Object> integerBox = new GenericBox<>();
         * 와 같이 사용할 수 있다고 이해하면 된다.
         * 하지만 타입 인자를 지정해서 사용하는 것을 권장한다.
         */
        GenericBox integerBox = new GenericBox();
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
