package ch05_package_inheritance.animalpkg01;

public class Eagle01 extends Animal01{
    private int wing;

    public Eagle01(String name, int lifespan, String habitat, int speed, int wing) {
        super(name, lifespan, habitat, speed);
        this.wing = wing;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(getName() + "의 날개 개수는 " + wing + "개입니다.");
    }

    public void fly() {
        System.out.println(getName() + "이(가) " + getSpeed() + "의 속도로 날아 다닙니다.");
    }
}
