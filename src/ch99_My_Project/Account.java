package ch99_My_Project;

import java.util.List;

public class Account {
    private static int idCounter = 1;       // static: 모든 객체가 공유
    private final int id;                   // final: 한 번 할당된 후 변경 불가
    private String accountNumber;           // 계좌 번호
    private String ownerName;               // 예금주
    private int balance;                    // 잔액
    private List<Transaction> transactions; // 거래 내역

    public Account(String accountNumber, String ownerName, int balance) {
        this.id = idCounter++;
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public List<Transaction> getTransactions() {
        return transactions;
    }
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    public int getId() {
        return id;
    }

    public String deposit(String accountNumber, int amount) {
        transactions.add(new Transaction(accountNumber, "입금", amount));
        this.balance += amount;
        return "입금 완료: " + amount + "원";
    }

    public String withDraw(String accountNumber, int amount) {
        if (amount > balance) {
            addTransaction(new Transaction(accountNumber, "출금실패", amount));
            return "잔액 부족: 출금 실패";
        }
        balance -= amount;
        transactions.add(new Transaction(accountNumber, "출금", amount));
        return "출금 완료: " + amount + "원";
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public void printTransactionHistory() {
        for(Transaction t :transactions){
            System.out.println(t);
        }
    }

    public String showAccount(String accountNumber) {
        String message = "";

        return message;
    }
}
