package lectureCode.lecture20240207;

public class Transaction {
    public static void main(String[] args) {
        Account send = new Account(500);
        Account receive = new Account(2000);

        Transaction transaction = new Transaction();
        transaction.transferMoney(send, receive, 1000);
    }
    public void transferMoney(Account sender, Account receiver, int amount) {
        long originalBalance = sender.getBalance(); // 송금 전 잔액 저장
        try {
            // 송금 과정
            sender.withdraw(amount); // 송금인에서 출금
            receiver.deposit(amount); // 수금인에게 입금
        } catch (Exception e) {
            // 에러 발생 시 이전 잔액으로 롤백

            System.out.println(sender.setBalance(originalBalance));
        }
    }
}
