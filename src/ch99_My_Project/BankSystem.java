package ch99_My_Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankSystem {
    private Map<String, Account> accounts = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public BankSystem() {}

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
        System.out.print("입금액 : ");
        String input = sc.nextLine();
        int amount;
        try {
            amount = Integer.parseInt(input);
            if (amount <= 0) {
                System.out.println("입금 금액은 1원 이상이어야 합니다.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("숫자를 정확히 입력해주세요.");
            return;
        }
        Account acc = accounts.get(accountNumber);
        String message = "";
        if (acc != null) {
            message = acc.deposit(accountNumber, amount);
        } else {
            message = "계좌를 찾을 수 없습니다.";
        }
        System.out.println(message);
    }

    public void withDraw() {
        System.out.print("출금할 계좌번호 : ");
        String accountNumber = sc.nextLine();
        System.out.print("출금액 : ");
        String input = sc.nextLine();
        int amount;
        try {
            amount = Integer.parseInt(input);
            if (amount <= 0) {
                System.out.println("출금 금액은 1원 이상이어야 합니다.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("숫자를 정확히 입력해주세요.");
            return;
        }
        Account acc = accounts.get(accountNumber);
        String message = "";
        if (acc != null) {
            message = acc.withDraw(accountNumber, amount);
        } else {
            message = "계좌를 찾을 수 없습니다.";
        }
        System.out.println(message);
    }

    public void showAccount() {
        System.out.print("조회할 계좌번호 : ");
        String accountNumber = sc.nextLine();
        Account acc = accounts.get(accountNumber);
        String message = "";
        if (acc != null) {
            message = acc.showAccount(accountNumber);
        } else {
            message = "계좌를 찾을 수 없습니다.";
        }
        System.out.println(message);
    }

    public void run() {
        while (true) {
            System.out.println("1. 입금 | 2. 출금 | 3. 가입 | 4. 종료");
            String input = sc.nextLine();
            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요!");
                continue; // 다시 반복
            }

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withDraw();
                    break;
                case 3:
                    createAccount();
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    sc.close(); // 여기서 닫기
                    return; // 메소드 종료 → main도 종료
            }
        }
    }
}
