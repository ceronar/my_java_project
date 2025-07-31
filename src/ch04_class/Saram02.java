package ch04_class;

public class Saram02 {
    // 스태틱 변수 = 클래스 변수 = 정적 변수
    static String nationality = "대한민국";

    // 멤버 변수들(인스턴스 변수)
    String name;
    double height;
    double weight;
    String hobby;
    String blood;

    // double PI = 3.14; // 인스턴스 변수
    final double PI = 3.14; // 상수(constant)

    public void display() { // 멤버 메소드
        // PI = 5.14; // 상수는 변경 불가
        int total = 0; // 지역 변수
        for(int i = 1; i < 11; i++) {
            total += 1;
        }
        System.out.println("총합 : " + total);


        System.out.println("국적 : " + nationality);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("무게 : " + weight);
        System.out.println("취미 : " + hobby);
        System.out.println("혈액형 : " + blood);
        ;
    }

    public Saram02() {}

    public Saram02(String name, double height, double weight, String hobby, String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;
    }
}
