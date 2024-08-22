package thread.control;

public class CheckedExceptionMain {
    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    /*
      자바에서 메서드를 재정의할 때, 재정의 메서드가 지켜야할 예외와 관련된 규칙이 존재
      1. 체크 예외
        - 부모 메서드가 체크 예외를 던지지 않는 경우, 재정의된 자식 메서드도 체크 예외를 던질 수 없다.
        - 자식 메서드는 부모 메서드가 던질 수 있는 체크 예외의 하위 타입만 던질 수 있다.
      2. 언체크(런타임) 예외
        - 예외 처리를 강제하지 않으므로 상관 없이 던질 수 있다.

      따라서 Runnable 인터페이스는 체크 예외에 대한 정의가 되어 있지 않아,
      재정의 run() 에서 체크 예외를 던질 수 없다.
     */
    static class CheckedRunnable implements Runnable {
        @Override
        public void run() /*throws Exception*/ { // 주석 풀면 예외 발생
            /*throw new Exception();*/ // 주석 풀면 예외 발생
        }
    }
}
