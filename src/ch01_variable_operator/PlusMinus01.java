package ch01_variable_operator;

public class PlusMinus01 {
    public static void main(String[] args) {
        int a = 10, b = 20, c;

        c = ++a + b++;
        System.out.println("a : " + a); // 11
        System.out.println("b : " + b); // 21
        System.out.println("c : " + c); // 31

        c = a++ + --b;
        System.out.println("a : " + a); // 12
        System.out.println("b : " + b); // 20
        System.out.println("c : " + c); // 31

        a = 15;
        b = 12;

        c = --a + --b;
        System.out.println("a : " + a); // 14
        System.out.println("b : " + b); // 11
        System.out.println("c : " + c); // 25

        a = 10;
        b = 20;

        ++a; // 11
        b--; // 19
        c = ++a + b--;
        System.out.println("a : " + a); // 12
        System.out.println("b : " + b); // 18
        System.out.println("c : " + c); // 31
    }
}
