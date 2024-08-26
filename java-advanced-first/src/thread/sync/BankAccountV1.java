package thread.sync;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

/*
  volatile 를 도입하면 동시성 문제가 해결되지 않을까?
  - volatile 는 한 스레드가 값을 변경했을 때 다른 스레드에서 변경된 값을 즉시 볼 수 있게 하는
    메모리 가시성의 문제를 해결할 뿐이다.
    따라서 volatile 를 사용해도 여전히 같은 문제가 발생한다.
 */
public class BankAccountV1 implements BankAccount {
//    private int balance;
    volatile private int balance;

    public BankAccountV1(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("거래 시작 = " + getClass().getSimpleName());

        log("[검증 시작] 출금액 = " + amount + ", 잔액 = " + balance);
        if (balance < amount) {
            log("[검증 실패] 출금액 = " + amount + ", 잔액 = " + balance);
            return false;
        }
        log("[검증 완료] 출금액 = " + amount + ", 잔액 = " + balance);

        sleep(1000); // 출금에 걸리는 시간으로 가정
        balance = balance - amount;
        log("[출금 완료] 출금액 = " + amount + ", 변경 잔액 = " + balance);

        log("거래 종료");
        return true;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
