package ch01_variable_operator;

public class ShowJumsu {
    public static void main(String[] args) {
        String name = "홍길동";
        double kor = 40.0;
        double eng = 43.0;
        double evr = (kor+eng)/2;

        System.out.println("이름 : " + name +
                        "\n국어 : " + kor +
                        "\n영어 : " + eng +
                        "\n평균 : " + evr);
    }
}
