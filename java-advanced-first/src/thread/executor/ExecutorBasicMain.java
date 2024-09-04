package thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static util.ExecutorUtils.printState;
import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ExecutorBasicMain {
    public static void main(String[] args) {
        /*
          corePoolSize: 스레드 풀에서 관리되는 기본 스레드의 수
          maximumPoolSize: 스레드 풀에서 관리되는 최대 스레드의 수
          keepAliveTime, TimeUnit: 기본 스레드 수를 초과해서 만들어진 스레드가 생존할 수 있는 대기 시간
          BlockingQueue: 작업을 보관할 블로킹 큐
         */
        ExecutorService executorService = new ThreadPoolExecutor(2,
                2, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());

        log("== 초기 상태 ==");
        printState(executorService);
        executorService.execute(new RunnableTask("taskA"));
        executorService.execute(new RunnableTask("taskB"));
        executorService.execute(new RunnableTask("taskC"));
        executorService.execute(new RunnableTask("taskD"));

        log("== 작업 수행 중 ==");
        printState(executorService);

        sleep(3000);
        log("== 작업 수행 완료 ==");
        printState(executorService);

        /*
          close()는 자바 19부터 지원되는 메서드이다.
          자바 19 버전 미만을 사용한다면 shutdown()을 사용하자.
         */
        executorService.close();
        log("== shutdown 완료 ==");
        printState(executorService);
    }
}
