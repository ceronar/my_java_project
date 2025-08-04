package ch99_My_Project;

import java.util.List;

public class Account {
    private static int idCounter = 1;       // static: 모든 객체가 공유
    private final int id;                   // final: 한 번 할당된 후 변경 불가
    private String accountId;
    private String ownerName;
    private int balance;                    // 잔액
    private List<Transaction> transactions; // 거래 내역

    public Account(String accountId, String ownerName, int balance) {
        this.id = idCounter++;
        this.accountId = accountId;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
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

    public void deposit(int amount) {

    }

    public void withDraw(int amount) {

    }

    public void addTransaction(Transaction t) {

    }

    public void printTransactionHistory() {

    }
}
