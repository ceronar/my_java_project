package ch02_control_statement;
import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        int i = 1, odd = 0, even = 0;
        while (i <= num) {
            if(i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
            i++;
        }
        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);
    }
}
