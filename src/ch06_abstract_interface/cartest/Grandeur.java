package ch06_abstract_interface.cartest;

public class Grandeur extends Car{
    private double fuel; // 연비
    private String remark; // 연비 멘트 > 파생변수 / fuel에 의해 결정

    public Grandeur(String name, int price, Key key, double fuel) {
        super(name, price, key);
        this.fuel = fuel;

        if(fuel >= 20.0) {
            remark = "excellent";
        } else if(fuel >= 15.0){
            remark = "good";
        } else {
            remark = "poor";
        }
    }

    public Grandeur(String name, int price, Key key, double fuel, String remark) {
        super(name, price, key);
        this.fuel = fuel;
        this.remark = remark;
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
        System.out.println("'" + getName() + "'의 현재 속도는 " + ((double)getSpeed()/1.6) + "mile 입니다.");
    }

    @Override
    public String toString() {
        return super.toString() + "\n연비 : " + fuel + "\n연비 메모 : " + remark;
    }
}
