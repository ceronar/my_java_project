package ch05_package_inheritance.animalpkg01;

public class GoldFish01 extends Animal01{
    private int gill;

    public GoldFish01(String name, int lifespan, String habitat, int speed, int gill) {
        super(name, lifespan, habitat, speed);
        this.gill = gill;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(getName() + "의 아가미수는 " + gill + "개 입니다.");
    }

    public void swim() {
        System.out.println(getName() + "이(가) " + getSpeed() + "의 속도로 헤엄칩니다.");
    }
}
