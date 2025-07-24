package ch01_variable_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 3, b = 50;

        // 3항 연산자 = 조건식 ? 참일때 : 거짓일때;
        int result = (a >= b) ? (a - b) : (b - a);

        System.out.println("절대 값 : " + result);

        int x = 10; // 홀수일 시 제곱 짝수일 시 +3
        result = (x % 2 == 0) ? (x + 3) : (x * x);
        System.out.println("결과 : " + result);

        x = 8;
        int y = 4;
        // 두 숫자 중 큰 숫자를 선택
        result = (x >= y) ? x : y;
        System.out.println("큰 수 : " + result);

        result = (x < y) ? x : y;
        System.out.println("작은 수 : " + result);

        x = 5;
        y = 12;
        String answer = (y % x == 0) ? "yes" : "no";
        System.out.println(x + "은(는) " + y + "의 약수 입니까? " + answer);

        int su = 7;
        // 숫자 7은(는) 홀수입니다.
        System.out.println("숫자 " + su + "은(는) " + ((su%2==0)?"짝수":"홀수") + "입니다.");

        int score = 85; // 60점 이상이면 합격
        // 85점이므로 합격입니다.
        System.out.println(score + "점이므로 " + ((score>=60)?"합격":"불합격") + "입니다.");
    }
}
