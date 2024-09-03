package thread.cas.spinlock;

import static util.MyLogger.log;

public class SpinLockMain {
    public static void main(String[] args) {
        SpinLock spinLock = new SpinLock();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                spinLock.lock();
                try {
                    // critical section
                    log("비즈니스 로직 실행");
//                    sleep(1); // 오래 걸리는 로직에서 스핀 락 사용 X
                } finally {
                    spinLock.unlock();
                }
            }
        };

        Thread thread1 = new Thread(runnable, "thread-1");
        Thread thread2 = new Thread(runnable, "thread-2");

        thread1.start();
        thread2.start();
    }
}
