package generic.ex5;

/**
 * 타입 이레이저 방식의 한계
 *  - 여기서 T 는 런타임에 모두 Object 가 되어버린다.
 *  - instanceof 는 항상 Object 와 비교하게 된다. 이렇게 되면 항상 참이반환되는 문제가 발생한다.
 *    자바는 이런 문제 때문에 타입 매개변수에 instanceof 를 허용하지 않는다.
 *  - new T 는 항상 new Object 가 되어버린다. 개발자가 의도한 것과는 다르다.
 *    따라서 자바는 타입 매개변수에 new 를 허용하지 않는다.
 */
public class EraserBox<T> {
    public boolean instanceCheck(Object param) {
//        return param instanceof T; // 컴파일 오류
        return false;
    }

    public void create() {
//        return new T(); // 컴파일 오류
    }
}
