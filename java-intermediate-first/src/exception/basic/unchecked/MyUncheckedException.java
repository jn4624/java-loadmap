package exception.basic.unchecked;

/**
 * RuntimeException을 상속 받은 예외는 언체크 예외가 된다.
 */
public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }

    /**
     * 언체크 예외의 장단점
     * 언체크 예외는 예외를 잡아서 처리할 수 없을 때,
     * 예외를 밖으로 던지는 throws 예외를 생략할 수 있다.
     *
     * 장점
     * - 신경쓰고 싶지 않은 언체크 예외를 무시할 수 있다.
     *   체크 예외의 경우 처리할 수 없는 예외를 밖으로 던지려면 항상 throws 예외를 선언해야 하지만,
     *   언체크 예외는 이 부분을 생략할 수 있다.
     *
     * 단점
     * - 언체크 예외는 개발자가 실수로 예외를 누락할 수 있다.
     *   반면에 체크 예외는 컴파일러를 통해 예외 누락을 잡아준다.
     */
}
