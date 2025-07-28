package ch02_control_statement;
import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나 입력 : ");
        int num = sc.nextInt();
        int sum0 = 0, sum1 = 0, sum2 = 0;
        for (int i = 1; i <= num; i++) {
            /*
            switch (i%3) {
                case 0: sum0 += i; break;
                case 1: sum1 += i; break;
                case 2: sum2 += i; break;
            }
             */
            if(i%3==0) {
                sum0 += i;
            } else if (i%3==1) {
                sum1 += i;
            } else {
                sum2 += i;
            }
        }
        System.out.printf("sum0 : %d\nsum1 : %d\nsum2 : %d", sum0, sum1, sum2);
        sc.close();
    }
}
