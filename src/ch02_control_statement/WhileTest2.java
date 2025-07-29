package ch02_control_statement;
import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int total = 0;
        while (true) {
            System.out.print("정수 입력 : ");
            int grade = sc.nextInt();
            if(grade <= 0) {
                System.out.println("음수 또는 0이여서 종료합니다.");
                break;
            }
            total += grade;
            count++;
        }
        System.out.println("총 시험 횟수 : " + count);
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.3f", ((double)total/count));
        sc.close();
    }
}
