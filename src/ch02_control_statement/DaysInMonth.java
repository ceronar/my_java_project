package ch02_control_statement;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 12 중 하나 입력 : ");
        int month = sc.nextInt();
        int days = 0;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31; break;
            case 4: case 6: case 9: case 11:
                days = 30; break;
            case 2:
                days = 28; break;
            default:
                System.out.println("error");
                System.exit(0); // 프로그램 강제 종료
        }
        System.out.printf("%d월의 마지막 날은 %d일입니다.", month, days);
    }
}
