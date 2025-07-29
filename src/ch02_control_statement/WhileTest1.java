package ch02_control_statement;
import java.util.Scanner;

public class WhileTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 단을 출력할까요 : ");
        int dan = sc.nextInt();
        int i = 1;
        StringBuilder str = new StringBuilder();
        while (i < 10) {
            // System.out.println(dan + " * " + i + " = " + (dan * i));
            str.append(dan).append(" * ").append(i).append(" = ").append(dan * i).append("\n");
            i++;
        }
        System.out.printf(str.toString());
        sc.close();
    }
}
