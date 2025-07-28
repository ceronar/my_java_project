package ch02_control_statement;
import java.util.Scanner;

public class Exam4_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("별 출력 개수 입력 : ");
        int star = sc.nextInt();
        for (int i = 1; i <= star; i++) {
            System.out.print("*");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.print("한 줄에 출력할 별의 개수 : ");
        int n = sc.nextInt();
        for (int i = 1; i <= star; i++) {
            System.out.print("*");
            if (i % n == 0) {
                System.out.println();
            }
        }
        sc.close();
    }
}
