package ch01_variable_operator;

public class LogicalOperator {
    public static void main(String[] args) {
        int x = 3, y = 2;

        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x >= y : " + (x >= y));
        System.out.println("!(x >= y) : " + (!(x >= y)));
        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y));
        System.out.println("-1 < 0 : " + (-1 < 0));
        System.out.println("3.45 < 2 : " + (3.45 < 2));
        System.out.println("(3 > 2) && (3 > 4) : " + ((3 > 2) && (3 > 4)));
        System.out.println("(x != y) && (-1 > 0) : " + ((x != y) && (-1 > 0)));
        System.out.println("'a'>'b' : " + ('a'>'b'));

    }
}
