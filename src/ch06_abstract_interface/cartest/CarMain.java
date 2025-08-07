package ch06_abstract_interface.cartest;

public class CarMain {
    public static void main(String[] args) {
        Car[] mycar = {
                new Avante("아반떼", 100, Key.KEY, "가장 많은 판매"),
                new Grandeur("그랜져", 200, Key.SMART, 9.5),
                new Sonata("소나타", 300, Key.SMART, "Hyundai")
        };

        int speed = 0; // 가속 또는 감속할 속도
        for (int i = 0; i < mycar.length; i++) {
            System.out.println("========================");
            mycar[i].turnOn(); // 시동 걸기
            Radio.play(Frequency.FM, 91.9); //FM 주파수 91.9 채널
            mycar[i].sayHello(mycar[i].getName(), 2);
            System.out.println(mycar[i]); // 암시적 toString() 메소드 호출됩니다.
            mycar[i].display();
            speed = (int)(Math.random()*20)+10;
            mycar[i].speedUp(speed); // 엑셀 밟기(10 이상 30미만)
            mycar[i].display(); // 계기판 확인
            speed = Speed.ALLOWED_MAX_SPEED;
            mycar[i].speedUp(speed);
            mycar[i].display();
            speed = (int)(Math.random()*20)+10;
            mycar[i].speedDown(speed);
            mycar[i].display();
            mycar[i].turnOff(); // 시동 끄기
        }
    }
}
