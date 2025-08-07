package ch06_abstract_interface.cartest;

public class Avante extends Car{
    private String comment; // 코멘트

    public Avante(String name, int price, Key key, String comment) {
        super(name, price, key);
        this.comment = comment;
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
        return super.toString() + "\n코멘트 : " + comment;
    }
}
