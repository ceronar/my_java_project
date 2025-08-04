package ch05_package_inheritance.mybeverage;

public class Espresso04 extends Beverage04 {
    private int shotCount;

    public Espresso04(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }

    @Override
    protected void showInfo() {
        super.showInfo();
        System.out.println("샷 추가 개수 : " + shotCount);
    }
}
