package thread.executor.poolsize;

import thread.executor.RunnableTask;

import java.util.concurrent.*;

import static util.ExecutorUtils.printState;
import static util.MyLogger.log;

/*
  1. 고정 풀 전략 -> newFixedThreadPool(nThreads)
     - 스레드 풀에 nThreads 만큼의 기본 스레드를 생성한다. 초과 스레드는 생성하지 않는다.
     - 큐 사이즈에 제한이 없다. (LinkedBlockingQueue)
     - 스레드 수가 고정되어 있기 때문에 CPU, 메모리 리소스가 어느 정도 예측 가능한 안정적인 방식이다.
 */
public class PoolSizeMainV2 {
    public static void main(String[] args) {
        /*
          Executors.newFixedThreadPool(2)
          ==
          new ThreadPoolExecutor(2, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>())
         */
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        log("pool 생성");
        printState(executorService);

        for (int i = 1; i <= 6; i++) {
            String taskName = "task" + i;
            executorService.execute(new RunnableTask(taskName));
            printState(executorService, taskName);
        }
        executorService.close();
        log("== shutdown 완료 ==");
    }
}
