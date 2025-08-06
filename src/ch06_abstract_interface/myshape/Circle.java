package ch06_abstract_interface.myshape;

public class Circle extends Shape {
    private double radius; // 반지름
    private double xpos; // x 좌표
    private double ypos; // y 좌표

    public Circle(String linecolor, String fillcolor, double radius, double xpos, double ypos) {
        super(linecolor, fillcolor);
        this.radius = radius;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    @Override
    public double calcArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calcPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public void display() {
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();
        System.out.println("원 정보");
        System.out.println("면적 : " + super.area);
        System.out.println("둘레 : " + super.perimeter);
        System.out.println("원 중심 : (" + xpos + ", " + ypos + ")");
    }
}
