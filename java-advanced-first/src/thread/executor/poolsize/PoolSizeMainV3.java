package thread.executor.poolsize;

import thread.executor.RunnableTask;

import java.util.concurrent.*;

import static util.ExecutorUtils.printState;
import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

/*
  1. 캐시 풀 전략 -> newCachedThreadPool()
     - 기본 스레드를 사용하지 않고, 60초 생존 주기를 가진 초과 스레드만 사용한다.
     - 초과 스레드의 수는 제한이 없다.
     - 큐에 작업을 저장하지 않는다. (SynchronousQueue)
       - 대신에 생상자의 요청을 스레드 풀의 소비자 스레드가 직접 받아서 바로 처리한다.
     - 모든 요청이 대기하지 않고 스레드가 바로바로 처리한다. 따라서 빠른 처리가 가능하다.

  2. SynchronousQueue
     - 아주 특별한 블로킹 큐
     - BlockingQueue 인터페이스 구현체 중 하나
     - 내부에 저장 공간이 없다. 대신 생상자의 작업을 소비자 스레드에게 직접 전달한다.
       - 쉽게 이야기해서 저장 공간의 크기가 0이고,
         생산자 스레드가 큐에 작업을 전달하면 소비자 스레드가 큐에서 작업을 꺼낼 때까지 대기한다.
     - 소비자 작업을 요청하면 기다리던 생산자가 소비자에게 직접 작업을 전달하고 반환한다. 반대의 경우도 같다.
     - 이름 그대로 생산자와 소비자를 동기화하는 큐이다.
       - 쉽게 이야기해서 중간에 버퍼를 두지 않는 스레드간 직거래라고 생각하면 된다.
 */
public class PoolSizeMainV3 {
    public static void main(String[] args) {
        /*
          Executors.newCachedThreadPool()
          ==
          new ThreadPoolExecutor(0, Integer.MAX_VALUE, 3, TimeUnit.SECONDS, new SynchronousQueue<>())
         */
//        ExecutorService executorService = Executors.newCachedThreadPool(); // 기본 keepAliveTime: 60L
        ExecutorService executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                3, TimeUnit.SECONDS, new SynchronousQueue<>());
        log("pool 생성");
        printState(executorService);

        for (int i = 1; i <= 4; i++) {
            String taskName = "task" + i;
            executorService.execute(new RunnableTask(taskName));
            printState(executorService, taskName);
        }

        sleep(3000);
        log("== 작업 수행 완료 ==");
        printState(executorService);

        sleep(3000);
        log("== maximumPoolSize 대기 시간 초과 ==");
        printState(executorService);

        executorService.close();
        log("== shutdown 완료 ==");
        printState(executorService);
    }
}
