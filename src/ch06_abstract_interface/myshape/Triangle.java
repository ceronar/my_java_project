package ch06_abstract_interface.myshape;

public class Triangle extends Shape {
    private double width; // 넓이
    private double height; // 높이

    public Triangle(String linecolor, String fillcolor, double width, double height) {
        super(linecolor, fillcolor);
        this.width = width;
        this.height = height;
    }

    // Implementation : 구체화(구현)
    @Override // 부모 클래스의 추상 메소드를 오버라이딩
    public double calcArea() { // 각 클래스는 각자의 맡은 역할을 여기에 구현
        return (width * height) / 2;
    }

    @Override
    public double calcPerimeter() {
        return 20.0;
    }

    @Override
    public void display() {
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();
        System.out.println("삼각형 정보");
        System.out.println("면적 : " + super.area);
        System.out.println("둘레 : " + super.perimeter);

    }
}
