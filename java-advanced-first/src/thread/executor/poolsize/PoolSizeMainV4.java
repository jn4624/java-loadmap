package thread.executor.poolsize;

import thread.executor.RunnableTask;

import java.util.concurrent.*;

import static util.ExecutorUtils.printState;
import static util.MyLogger.log;

/*
  1. 사용자 정의 풀 전략
     - 상황1: 점진적인 사용자 확대 -> 개발한 서비스가 잘 되어서 사용자가 점점 늘어난다.
     - 상황2: 감작스런 요청 증가 -> 마케팅 팀의 이벤트가 대성공하면서 갑자기 사용자가 폭증했다.

     다음과 같은 세분화된 전략을 사용하면 상황1, 상황2를 모두 어느 정도 대응할 수 있다.
     - 일반: 일반적인 상황에는 CPU, 메모리 자원을 예측할 수 있도록 고정 크기의 스레드로 서비스를 안정적으로 운영한다.
     - 긴급: 사용자의 요청이 갑자기 증가하면 긴급하게 스레드를 추가로 투입해서 작업을 빠르게 처리한다.
     - 거절: 사용자의 요청이 폭증해서 긴급 대응도 어렵다면 사용자의 요청을 거절한다.
 */
public class PoolSizeMainV4 {
    static final int TASK_SIZE = 1100; // 1. 일반
//    static final int TASK_SIZE = 1200; // 2. 긴급
//    static final int TASK_SIZE = 1201; // 3. 거절

    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(100, 200,
                60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000));
        printState(executorService);

        long startMs = System.currentTimeMillis();

        for (int i = 1; i <= TASK_SIZE; i++) {
            String taskName = "task" + i;
            try {
                executorService.execute(new RunnableTask(taskName));
                printState(executorService, taskName);
            } catch (RejectedExecutionException e) {
                log(taskName + " -> " + e);
            }
        }

        executorService.close();
        long endMs = System.currentTimeMillis();
        log("time -> " + (endMs - startMs));
    }
}
