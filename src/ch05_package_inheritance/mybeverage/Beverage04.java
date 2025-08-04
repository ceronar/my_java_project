package ch05_package_inheritance.mybeverage;

public class Beverage04 {
    private String name; // 이름
    private double price; // 단가

    protected void showInfo() {
        System.out.println("\n음료 이름 : " + name);
        System.out.println("단가 : " + price);
    }

    public Beverage04() {}

    public Beverage04(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
