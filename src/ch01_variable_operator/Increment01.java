package ch01_variable_operator;

public class Increment01 {
    public static void main(String[] args) {
        int x = 5;

        x += 3; // x = x + 3;
        System.out.println("x : " + x);

        x *= 4; // x = x * 4;
        System.out.println("x : " + x);

        x %= 5; // x = x % 5;
        System.out.println("x : " + x);

        x -= 1; // x = x - 1;
        System.out.println("x : " + x);

        x += 7; // x = x + 7;
        System.out.println("x : " + x);

        int total = 0;
        for(int i = 0; i < 10; i++) {
            total += i + 1;
            System.out.println(total);
        }
        System.out.println("1부터 10까지의 합은 " + total);
    }
}
