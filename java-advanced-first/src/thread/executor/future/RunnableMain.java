package thread.executor.future;

import java.util.Random;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

/*
  Runnable 의 불편함
  1. 반환 값이 없다:
     - run() 메서드는 반환 값을 가지지 않는다.
     - 따라서 실행 결과를 얻기 위해서는 별도의 메커니즘을 사용해야 한다.
     - 쉽게 이야기해서 스레드의 실행 결과를 직접 받을 수 없다.
     - 앞에서 공부한 SumTask 의 예를 보면, 스레드가 실행한 결과를 멤버 변수에 넣어두고 join()등을 사용해서
       스레드가 종료되길 기다린 다음에 멤버 변수를 통해 값을 받아야 한다.
  2. 예외 처리:
     - run() 메서드는 체크 예외를 던질 수 없다.
     - 체크 예외의 처리는 메서드 내부에서 처리해야 한다.
 */
public class RunnableMain {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable, "thread-1");
        thread.start();
        thread.join();
        int result = myRunnable.value;
        log("result value = " + result);
    }

    static class MyRunnable implements Runnable {
        int value;

        @Override
        public void run() {
            log("Runnable 시작");
            sleep(2000);
            value = new Random().nextInt(10);
            log("create value = " + value);
            log("Runnable 완료");
        }
    }
}
