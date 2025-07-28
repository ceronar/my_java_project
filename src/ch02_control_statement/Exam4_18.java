package ch02_control_statement;
import java.util.Scanner;

public class Exam4_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("임의의 정수 입력 (2 이상) : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i + "의 제곱은 " + (i*i) + "입니다.");
        }
        sc.close();
        System.out.println();

        int num01 = 3;
        int num02 = 7;
        int sum = 0;
        for (int i = num01; i <= num02; i++) {
            sum += i;
        }
        System.out.println(num01 + "부터 " + num02 + "까지의 합 : " + sum);
    }
}
