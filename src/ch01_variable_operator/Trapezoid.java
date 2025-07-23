package ch01_variable_operator;

public class Trapezoid {
    public static void main(String[] args) {
        int bottom = 20;
        int top = 10;
        int height = 15;
        double area = (double) ((bottom + top) * height) / 2;

        System.out.println("밑면 : " + bottom +
                        "\n윗변 : " + top +
                        "\n높이 : " + height +
                        "\n면적 : " + area);
    }
}
