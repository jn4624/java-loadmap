package thread.executor.reject;

import thread.executor.RunnableTask;

import java.util.concurrent.*;

import static util.MyLogger.log;

public class RejectMainV2 {
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(1, 1,
                0, TimeUnit.SECONDS, new SynchronousQueue<>(), new ThreadPoolExecutor.DiscardPolicy());

        executorService.submit(new RunnableTask("task1"));
        executorService.submit(new RunnableTask("task2"));
        executorService.submit(new RunnableTask("task3"));

        executorService.close();
    }
}
