package ch05_package_inheritance.general;

public class Espresso03 extends Beverage03{
    private int shotCount;

    public Espresso03(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("샷 추가 개수 : " + shotCount);
        System.out.println();
    }
}
