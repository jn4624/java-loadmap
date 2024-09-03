package thread.cas.spinlock;

import static util.MyLogger.log;

public class SpinLockBadMain {
    public static void main(String[] args) {
        SpinLockBad spinLock = new SpinLockBad();

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
