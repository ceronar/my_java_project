package ch01_variable_operator;

public class Arithmetic01 {
    public static void main(String[] args) {
        int x = 14, y = 5;
        System.out.println("더하기 : " + (x + y));
        System.out.println("빼기 : " + (x - y));
        System.out.println("곱하기 : " + (x * y));
        System.out.println("나누기 : " + (x / y));
        System.out.println("나머지 : " + (x % y));

        System.out.println("동일 라인에서 곱셈/ 나눗셈이 먼저 실행");
        System.out.println("2 + 3 * 3 = " + (2 + 3 * 3));

        System.out.println("소괄호는 연산 순서를 변경할 수 있음");
        System.out.println("(2 + 3) * 3 = " + (2 + 3) * 3);

        System.out.println("데이터 타입이 다른 경우 큰 타입으로 변경 후 연산");
        System.out.println("14/5.0 = " + 14/5.0);
    }
}
