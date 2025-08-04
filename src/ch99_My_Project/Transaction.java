package ch99_My_Project;

import java.time.LocalDateTime;

public class Transaction {
    int transactionId; // 입금 or 출금 계좌 id
    String type; // ("입금" 또는 "출금")
    int amount; // 금액
    LocalDateTime timestamp; // 거래시간

    public Transaction(int transactionId, String type, int amount) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Transaction(" + transactionId + ", " + type + ", " + amount + ", " + timestamp + ')';
    }
}
