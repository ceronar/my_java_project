package ch05_package_inheritance.mybeverage;

public class Latte04 extends Beverage04 {
    private String milkType;

    public void enjoyLatte() {
        String message = "부드럽고 크리미한 " + getName() + "을(를) 마십니다.";
        System.out.println(message);
    }

    public Latte04(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }

    @Override
    protected void showInfo() {
        super.showInfo();
        System.out.println("우유 타입 : " + milkType);
    }

    @Override
    public String toString() {
        return super.toString() + ", 우유 타입 : " + milkType;
    }
}
