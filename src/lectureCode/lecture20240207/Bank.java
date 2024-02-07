package lectureCode.lecture20240207;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account(100);
        account.deposit(2000);
        System.out.println("잔액: " + account.getBalance());

        try {
            account.withdraw(2000);
        } catch (balanceInsufficientException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("잔액: " + account.getBalance());
    }
}
