package ch06_abstract_interface.cartest;

public abstract class Car implements Speed, Display, Radio {
    // 일반화) 모든 차들에게 공통적으로 적용할 수 있는 변수를 여기에 정의한다
    private String name; // 차량 모델 이름
    private int price; // 가격
    private Key key; // 열쇠의 유형

    private int speed = 0;

    public Car(String name, int price, Key key) {
        this.name = name;
        this.price = price;
        this.key = key;
    }

    public final void turnOn() {
        String message = key.getName() + "로 " + name + "의 시동을 겁니다.";
        System.out.println(message);
    }

    public final void turnOff() {
        String message = name + "의 시동을 끕니다.";
        System.out.println(message);
    }

    public void checkSpeed() {
        if(speed > ALLOWED_MAX_SPEED) {
            System.out.println(ALLOWED_MAX_SPEED + "km 이상 과속하지 마세요.");
            speed = ALLOWED_MAX_SPEED;
        } else if(speed <= 0) {
            System.out.println("정차");
            speed = 0;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "이름 : " + name + "\n" +
                "단가 : " + price + "원\n" +
                "열쇠 타입 : " + key + "\n" +
                "한글 이름 : " + key.getName();
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
