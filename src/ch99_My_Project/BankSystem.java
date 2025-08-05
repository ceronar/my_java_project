package ch99_My_Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankSystem {
    private Map<String, Account> accounts = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public String createAccount() {
        // accountId, ownerName, balance
        String accountNumber = "";
        while (true) {
            System.out.print("계좌번호 : ");
            accountNumber = sc.nextLine();
            if(accounts.containsKey(accountNumber)) { // 중복 있는지 확인
                System.out.println("이미 존재하는 계좌번호입니다.");
            } else {
                break;
            }
        }
        System.out.print("예금주 명 : ");
        String ownerName = sc.nextLine();
        System.out.print("초기 입금액 : ");
        int balance = sc.nextInt();
        accounts.put(accountNumber, new Account(accountNumber, ownerName, balance));
        return "가입성공";
    }

    public void deposit() {
        System.out.print("입금할 계좌번호 : ");
        String accountNumber = sc.nextLine();
        System.out.print("금액 : ");
        int amount = sc.nextInt();
        Account acc = accounts.get(accountNumber);
        String message = "";
        if (acc != null) {
            message = acc.deposit(accountNumber, amount);
        } else {
            message = "계좌를 찾을 수 없습니다.";
        }
        System.out.println(message);
    }

    public void withdraw(String accountNumber, int amount) {

    }

    public void showAccount(String accountNumber) {

    }
}
