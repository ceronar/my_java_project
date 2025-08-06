package ch06_abstract_interface.beveragetest;

public class Latte extends Beverage {
    private String milkType;

    @Override
    public void drink() {
        System.out.println("부드럽고 크리미한 " + getName() + "를 마십니다.");
    }

    @Override
    public void make() {
        System.out.println(getName() + " 제조법\n" +
                "에스프레소 1샷을 추출합니다.\n" +
                "컵에 에스프레소를 넣고 뜨거운 물을 부어줍니다.\n" +
                "에스프레소를 먼저 넣고 물을 나중에 부으면 됩니다.");
    }

    public Latte(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }
}
