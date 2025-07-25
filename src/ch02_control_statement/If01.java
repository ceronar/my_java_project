package ch02_control_statement;

public class If01 {
    public static void main(String[] args) {
        int su = 10;

        if(su%2==0) {
            System.out.println("짝수 " + su);
        }

        if(su%2==0) {
            System.out.println("숫자 " + su + "은(는) 짝수 입니다.");
            System.out.println("123");
        } else {
            System.out.println("숫자 " + su + "은(는) 홀수 입니다.");
            System.out.println("456");
        }
        System.out.println("zzz");

    }
}
