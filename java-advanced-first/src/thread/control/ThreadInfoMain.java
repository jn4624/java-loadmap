package thread.control;

import thread.start.HelloThread;

import static util.MyLogger.log;

public class ThreadInfoMain {
    public static void main(String[] args) {
        // main 스레드
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.threadId = " + mainThread.threadId());
        log("mainThread.getName = " + mainThread.getName());
        /*
          getPriority(): 1(가장 낮음) ~ 10(가장 높음) - default 5
         */
        log("mainThread.getPriority = " + mainThread.getPriority());
        log("mainThread.getThreadGroup = " + mainThread.getThreadGroup());
        /*
          getState(): 스레드의 현재 상태를 반환(반환되는 값은 Thread.State 열거형에 정의된 상수 중 하나)
          - NEW: 스레드가 아직 시작되지 않은 상태
          - RUNNABLE: 스레드가 실행 중이거나 실행될 준비가 된 상태
          - BLOCKED: 스레드가 동기화 락을 기다리는 상태
          - WAITING: 스레드가 다른 스레드의 특정 작업이 완료되기를 기다리는 상태
          - TIMED_WAITING: 일정 시간 동안 기다리는 상태
          - TERMINATED: 스레드가 실행을 마친 상태
         */
        log("mainThread.getState = " + mainThread.getState());
        System.out.println();

        // myThread 스레드
        Thread myThread = new Thread(new HelloThread(), "myThread");
        log("myThread = " + myThread);
        log("myThread.threadId = " + myThread.threadId());
        log("myThread.getName = " + myThread.getName());
        log("myThread.getPriority = " + myThread.getPriority());
        log("myThread.getThreadGroup = " + myThread.getThreadGroup());
        log("myThread.getState = " + myThread.getState());
    }
}
