package thread.executor.future;

import java.util.concurrent.*;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class FutureCancelMain {
    private static final boolean mayInterruptIfRunning = true; // 변경
//    private static final boolean mayInterruptIfRunning = false; // 변경

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> future = executorService.submit(new MyTask());
        log("future.state = " + future.state());

        // 일정 시간 이후 취소 시도
        sleep(3000);

        // cancel() 호출
        log("future.cancel( " + mayInterruptIfRunning + " ) 호출");
        boolean cancelResult = future.cancel(mayInterruptIfRunning);
        log("future.state = " + future.state());
        log("future.cancel( " + mayInterruptIfRunning + " ) result = " + cancelResult);

        // 결과 확인
        try {
            log("future result = " + future.get());
        } catch (CancellationException e) { // 런타임 예외
            log("future 는 이미 취소되었습니다.");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Executor 종료
        executorService.close();
    }

    static class MyTask implements Callable<String> {
        @Override
        public String call() {
            try {
                for (int i = 0; i < 10; i++) {
                    log("작업 중 = " + i);
                    Thread.sleep(1000); // 1초 동안 sleep
                }
            } catch (InterruptedException e) {
                log("인터럽트 발생");
                return "Interrupted";
            }
            return "Completed";
        }
    }
}
