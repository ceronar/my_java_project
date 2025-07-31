package ch04_class;

public class SaramMain01 {
    public static void main(String[] args) {

        // 단계 2 : 객체 생성
        // 클래스이름 객체이름 = new 생성자이름();
        Saram01 yusin = new Saram01();
        Saram01 soon;
        soon = new Saram01();

        // 단계 3 : 객체의 멤버 변수에 쓰기 작업
        // 점(.)을 멤버 참조 연산자라고 부름
        yusin.setNationality("대한민국");
        yusin.setName("김유신");
        yusin.setHeight(172.5);
        yusin.setWeight(75.0);
        yusin.setHobby("당구");
        yusin.setBlood("AB");
        // 클래스의 요소에 직접 접근 > 비권장 setter getter 이용
        soon = new Saram01("대한민국", "유관순", 168.5, 50.0, "축구", "O");

        // 단계 4 : 객체의 멤버 변수의 값을 출력
        yusin.display();
        yusin.showGenderInfo(1);
        yusin.showBmiInfo();

        System.out.println();

        soon.display();
        soon.showGenderInfo(2);
        soon.showBmiInfo();


    }
}
