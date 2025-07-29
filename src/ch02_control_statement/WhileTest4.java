package ch02_control_statement;
import java.util.Scanner;

public class WhileTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int total = 0;
        while (true) {
            System.out.print("정수 입력 : ");
            int grade = sc.nextInt();
            if(grade < -10) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } /* else if(grade < 0) {
                grade = -grade;
            } */
            grade = Math.abs(grade);
            total += grade;
            count++;
        }
        System.out.println("총 시험 횟수 : " + count);
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.3f", ((double)total/count));
        sc.close();
    }
}
