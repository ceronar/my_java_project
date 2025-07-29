package ch02_control_statement;

public class While01 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(i < 11) {
            sum += i;
            i++;
        }
        System.out.println("총합01 : " + sum);

        sum = 0;
        i = 1;
        while (i <= 100) {
            sum += i;
            i = i + 3;
        }
        System.out.println("총합02 : " + sum);

        sum = 0;
        i = 97;
        while (i > 1) {
            sum += i;
            i = i - 5;
        }
        System.out.println("총합03 : " + sum);

        sum = 0;
        i = 1;
        while (i < 100) {
            sum += (i*i);
            i = i + 5;
        }
        System.out.println("총합04 : " + sum);

        sum = 0;
        i = 1;
        while (i < 6) {
            sum += i * (i+1);
            i++;
        }
        System.out.println("총합05 : " + sum);
    }
}
