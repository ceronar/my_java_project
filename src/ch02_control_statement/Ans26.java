package ch02_control_statement;
import java.util.Scanner;

public class Ans26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = (int)(Math.random()*100) + 1;
        int count = 0;
        int num = 0;
        while (true) {
            System.out.print("1부터 100사이의 정수 1개를 입력하세요 : ");
            num = sc.nextInt();
            count++;
            if(answer < num) {
                System.out.println(num + "보다 작은 수입니다.");
            } else if(answer > num) {
                System.out.println(num + "보다 큰 수입니다.");
            } else {
                System.out.println("정답입니다.");
                System.out.println(count + "번 시도하여 맞추었습니다.");
                break;
            }
            System.out.println();
        }
        sc.close();
    }
}
