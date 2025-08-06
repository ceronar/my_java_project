package ch06_abstract_interface.beveragetest;

public abstract class Beverage {
    private String name;
    private double price;

    final void showData() {
        System.out.println("음료 " + name + "의 단가는 " + price + "원 입니다.");
    }
    public abstract void drink();
    public abstract void make();

    public Beverage() {}

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
