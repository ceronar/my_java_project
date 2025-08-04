package ch05_package_inheritance.mysport;

public class BaseBall extends Sport {
    private int innings; // 이닝 수
    private double hitRate; // 타율

    public BaseBall(String name, int entry, int innings, double hitRate) {
        super(name, entry);
        this.innings = innings;
        this.hitRate = hitRate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(innings + "개의 이닝으로 구성이 되며, 타율 " + hitRate + "를 기록하였습니다.");
        System.out.println();
    }
}
