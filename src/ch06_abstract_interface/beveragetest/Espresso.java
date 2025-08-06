package ch06_abstract_interface.beveragetest;

public class Espresso extends Beverage {
    private int shots;

    @Override
    public void drink() {
        System.out.println("맛이 진하고 강렬한 " + getName() + "를 마십니다.");
    }

    @Override
    public void make() {
        System.out.println(getName() + " 제조법\n" +
                "원두를 미세하게 갈아서, 탬퍼로 평평하게 눌러줍니다.\n" +
                "포터필터를 머신에 장착하고, 25-30초 동안 30ml의 에스프레소를 추출합니다.");
    }

    public Espresso(String name, double price, int shots) {
        super(name, price);
        this.shots = shots;
    }
}
