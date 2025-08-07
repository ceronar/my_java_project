package ch06_abstract_interface.cartest;

public class Sonata extends Car{
    private String maker; // 메이커

    public Sonata(String name, int price, Key key, String maker) {
        super(name, price, key);
        this.maker = maker;
    }

    @Override
    public void speedUp(int su) {
        setSpeed(getSpeed()+su);
        checkSpeed();
    }

    @Override
    public void speedDown(int su) {
        setSpeed(getSpeed()-su);
        checkSpeed();
    }

    @Override
    public void display() {
        System.out.println("'" + getName() + "'의 현재 속도 : " + getSpeed() + "(km)");
    }

    @Override
    public String toString() {
        return super.toString() + "\n메이커 : " + maker;
    }
}
