package ch02_control_statement;
import java.util.Scanner;

public class For02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("임의의 정수 입력 : ");
        int num = sc.nextInt();
        int odd = 0;
        int even = 0;

        for (int i = 1; i <= num; i++) {
            /*
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
             */
            switch (i%2) {
                case 0: even += i; break;
                case 1: odd += i; break;
            }
        }
        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);
    }
}
