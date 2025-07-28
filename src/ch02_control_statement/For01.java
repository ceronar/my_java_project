package ch02_control_statement;

public class For01 {
    public static void main(String[] args) {
        int total = 0;
        int num = 0;

        for(int i = 1; i <= 10; i++) {
            total += i;
        }
        System.out.println("총합01 : " + total);

        total = 0;
        for (int i = 1; i < 101; i += 3) {
            total += i;
        }
        System.out.println("총합02 : " + total);

        total = 0;
        for (int i = 97; i >= 1; i -= 5) {
            total += i;
        }
        System.out.println("총합03 : " + total);

        total = 0;
        for (int i = 1; i < 101; i += 5) {
            total += i * i;
        }
        System.out.println("총합04 : " + total);

        total = 0;
        for (int i = 1; i < 6; i += 1) {
            total += i * (i + 1);
        }
        System.out.println("총합05 : " + total);
    }
}
