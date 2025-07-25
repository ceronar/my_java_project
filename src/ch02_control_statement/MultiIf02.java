package ch02_control_statement;

public class MultiIf02 {
    public static void main(String[] args) {
        int age = 17;
        double ticket = 1000.0;
        double discount = 0.0; // 할인율
        String str = ""; // 분류

        if(age < 8) {
            discount = 1.0;
            str = "유아(무료 입장)";
        } else if(age < 14) {
            discount = 0.5;
            str = "어린이(50% 할인)";
        } else if(age < 20) {
            discount = 0.3;
            str = "청소년(30% 할인)";
        } else if(age >= 65) {
            discount = 0.4;
            str = "노인(40% 할인)";
        } else {
            discount = 0.0;
            str = "성인(정가)";
        }
        System.out.println("\t" + age + "세 : " + str + "\n\t가격은 " + (int)(ticket*(1-discount)) + "원입니다.");
    }
    /*
    파일 : MultiIf02.java

    int age = 10 ;
    double ticket = 1000.0 ;
    double discount ; // 할인율

    8세 미만 : "유아(무료 입장)"
    14세 미만 : "어린이(50% 할인)"
    20세 미만 : "청소년(30% 할인)"
    65세 이상 : "노인(40% 할인)"
    이외 : "성인(정가)"

    출력 예시 01:
       10살 : 어린이(50% 할인)
       가격은 500원입니다.

    출력 예시 02:
       16살 : 청소년(30% 할인)
       가격은 700원입니다.
    *
    * */
}
