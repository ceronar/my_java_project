package ch05_package_inheritance.animalpkg01;

public class Lion01 extends Animal01{
    private int leg;

    public Lion01(String name, int lifespan, String habitat, int speed, int leg) {
        super(name, lifespan, habitat, speed);
        this.leg = leg;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(getName() + "의 다리 개수는 " + leg + "개 입니다.");
    }

    public void run() {
        System.out.println(getName() + "이(가) " + getSpeed() + "의 속도로 달려 갑니다.");
    }
}
