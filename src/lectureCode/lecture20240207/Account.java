package lectureCode.lecture20240207;

/**
 * 계좌 => Account
 * 1. 입금 (2000) .2 출금(-3000) -> Bank (메인 메서드)
 * 잔액이 부족할 경우 사용자 정의 예외 -> BalanceInsufficientException
 */

public class Account {
    private long balance;
    private int originalBalance;
    public Account(long initialBalance) {
        originalBalance = 0;
        balance = initialBalance;
    }

    public long getBalance() {
        return balance;
    }

    public long setBalance(long newBalance) {
        this.balance = newBalance;
        return this.balance;
    }

    public void deposit(long money) {
        balance =+ money;
    }

    public void withdraw(long money) throws balanceInsufficientException {
        //잔액 부족할 경우 오류 발생
        if (balance < money) {
            throw new balanceInsufficientException(
                    "잔액부족! 현재 잔액: " + balance + ", 출금하고자 하는 금액: " + money);
        }
        balance -= money;
    }


}
