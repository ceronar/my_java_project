package ch01_variable_operator;

public class MyBox {
    public static void main(String[] args) {
        int width = 10;
        int height = 5;
        int area = width * height;
        int perimeter = (width + height) * 2;
        double diagonal = Math.sqrt(Math.pow(width, 2) +Math.pow(height, 2));

        System.out.println("너비 : " + width);
        System.out.println("높이 : " + height);
        System.out.println("둘레 : " + perimeter);
        System.out.println("넓이 : " + area);
        System.out.println("대각선의 길이 : " + diagonal);
    }
}
