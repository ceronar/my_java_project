package ch05_package_inheritance.mybeverage;

public class Latte04 extends Beverage04 {
    private String milkType;

    public Latte04(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }

    @Override
    protected void showInfo() {
        super.showInfo();
        System.out.println("우유 타입 : " + milkType);
    }
}
