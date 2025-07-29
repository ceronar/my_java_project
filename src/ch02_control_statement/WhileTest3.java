package ch02_control_statement;
import java.util.Scanner;

public class WhileTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 팩토리얼 값을 입력 : ");
        int num = sc.nextInt();
        int fac = 1;
        StringBuilder str = new StringBuilder();
        num = Math.abs(num);
        while (num >= 1) {
            fac *= num;
            if(num != 1) {
                str.append(num).append(" * ");
            } else {
                str.append(num).append(" = ");
            }
            num--;
        }
        str.append(fac);
        System.out.println(str);
        sc.close();
    }
}
