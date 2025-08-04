package ch05_package_inheritance.mybeverage;

public class InheTest04 {
    public static void main(String[] args) {
        // 클래스이름 객체이름 = new 생성자이름();

        // 승급 : 서브 클래스가 일시적으로 슈퍼 클래스의 타입으로 변환이 되는 과정
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 250.0);
        Beverage04 beverage02 = new Espresso04("에스프레소", 5000.0, 2);
        Beverage04 beverage03 = new Latte04("라떼", 6000.0, "아몬드 우유");

        // 슈퍼 클래스 내에 있는 메소드는 상속 개념에 의하여 접근이 가능하다.
        beverage01.showInfo();
        beverage02.showInfo();
        beverage03.showInfo();

        // 승급시 서브 클래스내의 변수와 메소드는 일시적으로 접근을 하지 못하도록 설계되어 있다.
        // 단, 강등을 하게 되면 서브 클래스 내의 변수와 메소드를 접근할 수 있다.
        int i = (int)3.14;
        Americano04 ame = (Americano04) beverage01; // 강등
        ame.sipAmericano();
    }
}
