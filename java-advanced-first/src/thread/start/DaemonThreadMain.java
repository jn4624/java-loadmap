package thread.start;

public class DaemonThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        DaemonThread daemonThread = new DaemonThread();
        /*
          daemonThread.setDaemon(true); 로 설정할 경우
          유일한 user 스레드인 main 스레드가 종료되면서 자바 프로그램도 종료된다.
          따라서 run() end 가 출력되기 전에 프로그램이 종료된다.

          daemonThread.setDaemon(false); 로 설정할 경우 - default false
          Thread-0 이 user 스레드로 설정되어
          main 스레드가 종료되어도 user 스레드인 Thread-0가 종료될 때까지 자바 프로그램이 종료되지 않는다.
          따라서 run() end 가 출력된 후 프로그램이 종료된다.
         */
        daemonThread.setDaemon(true); // 데몬 스레드 여부 - .start() 전에 설정해야 한다. 이후에는 변경되지 않는다.
        daemonThread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }

    static class DaemonThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run() start");

            /*
              Thread.sleep(); 을 호출할 때
              체크 예외인 InterruptedException 을 밖으로 던질 수 없고 반드시 try/catch 로 잡아야 한다.
              run() 메서드는 체크 예외를 밖으로 던질 수 없다.
             */
            try {
                Thread.sleep(10000); // 10초간 실행
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + ": run() end");
        }
    }
}
