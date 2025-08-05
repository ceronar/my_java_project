package ch05_package_inheritance.mybeverage;

public class Beverage04 {
    private String name; // 이름
    private double price; // 단가

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

    protected void showInfo() {
        System.out.println("\n음료 이름 : " + name);
        System.out.println("단가 : " + price);
    }

    public Beverage04() {}

    public Beverage04(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // 메소드 은닉화 : 오버라이딩시 본의 아니게, 수퍼 클래스의 메소드가 숨겨지는 현상을 일컫는 말
    // @ 으로 시작하는 항목들을 어노테이션(Annotation) 이라고 부른다.
    @Override // 이 메소드는 오버라이딩 되었다.
    public String toString() {
        return "품명 : " + name + ", 단가 : " + price + "원";
    }
}
