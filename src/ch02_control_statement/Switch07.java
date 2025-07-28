package ch02_control_statement;
// import java.util.Scanner;

public class Switch07 {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);

        System.out.printf("주사위 결과 : ");
        int num = sc.nextInt();
         */
        int num = (int) (Math.random() * 6) + 1;
        System.out.println("주사위 결과 : " + num);

        switch (num) {
            case 1: case 3: case 5: // 자바 버전차이로 case 1, 3, 5: 도 가능
                System.out.println("홀수");
                break;
            case 2: case 4: case 6:
                System.out.println("짝수");
                break;
            default:
                System.out.println("ERROR");
        }
        /*
        switch (num % 2) { // 입력 제한 (1 ~ 6) 필요
            case 0:
                System.out.println("짝수");
                break;
            case 1:
                System.out.println("홀수");
                break;
            default:
                System.out.println("ERROR");
        }
        */
        /*
        if(num > 6 || num < 1) {
            System.out.println("error");
        } else if(num % 2 == 0){
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
        */
    }
}
