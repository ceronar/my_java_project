package ch05_package_inheritance.general;

//   상속  :  서브클래스 extends 슈퍼클래스
public class Americano03 extends Beverage03{
    private double waterAmount; // 투입하는 물의 양

    public Americano03(String name, double price, double waterAmount) {
        // super(); // 부모클래스의 생성자 호출
        super(name, price);
        this.waterAmount = waterAmount;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("투입된 물의 양 : " + waterAmount + "ml");
        System.out.println();
    }
}
