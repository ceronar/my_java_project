package ch05_package_inheritance.mybeverage;

public class Americano04 extends Beverage04 {
    private double waterAmount;

    public void sipAmericano(){
        String message = "아메리카노를 홀짝 홀짝 마신다.";
        System.out.println(message);
    }

    public Americano04(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }

    @Override
    protected void showInfo() {
        super.showInfo();
        System.out.println("투입된 물의 양 : " + waterAmount + "ml");
    }

    @Override
    public String toString() {
        return super.toString() + ", 물량 : " + waterAmount + "ml";
    }
}
