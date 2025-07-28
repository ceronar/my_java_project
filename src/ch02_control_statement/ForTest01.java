package ch02_control_statement;
import java.util.Scanner;

public class ForTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("구구단 단수 입력 (0일시 종료) : ");
            int dan = sc.nextInt();
            if(dan == 0) { break; }
            System.out.println("---" + dan + "단---");
            for (int i = 1; i < 10; i++) {
                System.out.println(dan + " * " + i + " = " + (dan*i));
            }
            System.out.println();
        }
        sc.close();
    }}
