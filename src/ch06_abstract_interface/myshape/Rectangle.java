package ch06_abstract_interface.myshape;

public class Rectangle extends Shape {
    private double width; // 넓이
    private double height; // 높이

    public Rectangle(double width) {
        this.width = width;
    }

    public Rectangle(String linecolor, String fillcolor, double height, double width) {
        super(linecolor, fillcolor);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public double calcPerimeter() {
        return 2*(height+width);
    }

    @Override
    public void display() {
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();
        System.out.println("사각형 정보");
        System.out.println("면적 : " + super.area);
        System.out.println("둘레 : " + super.perimeter);
    }
}
