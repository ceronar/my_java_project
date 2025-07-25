package ch01_variable_operator;

public class Casting {
    public static void main(String[] args) {
        double d = 100;
        System.out.println("d : " + d); // 100.0

        int i = (int)12.5;
        System.out.println("i : " + i); // 12

        System.out.println(14/5); // 2

        //             명시적       암시적
        // (double)14/5 ---> 14.0/5 ---> 14.0/5.0 ---> 2.8
        System.out.println((double)14/5); // 2.8

        //                                명시적
        // (double)(14/5) ---> (double)(2) ---> 2.0
        System.out.println((double)(14/5)); // 2.0

        int kor = 50, eng = 60, math = 80;
        int total = kor + eng + math;
        double average = (double) total / 3;
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + average);

        char ch1 = 'c';
        char ch2 = 'a';

        boolean bool1 = ch1 > ch2; // 암시적 형변환 99 > 97 즉, true
        System.out.println("bool1 : " + bool1);

        int result = ch1 - ch2 + 5;
        System.out.println("result : " + result);

        char ch3 = 'D';
        String str = (ch3 >= 'A' && ch3 <= 'Z') ? "Yes" : "No";
        System.out.println(ch3 + "는(은) 대문자인가? " + str);
    }
}
