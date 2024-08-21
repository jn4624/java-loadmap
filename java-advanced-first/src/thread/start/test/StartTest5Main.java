package thread.start.test;

import static util.MyLogger.log;

public class StartTest5Main {
    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintWorker("A", 1000), "Thread-A");
        Thread threadB = new Thread(new PrintWorker("B", 500), "Thread-B");

        threadA.start();
        threadB.start();
    }

    static class PrintWorker implements Runnable {
        private final String word;
        private final int sleepMs;

        public PrintWorker(String word, int sleepMs) {
            this.word = word;
            this.sleepMs = sleepMs;
        }

        @Override
        public void run() {
            while (true) {
                log(word);
                try {
                    Thread.sleep(sleepMs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
