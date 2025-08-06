package ch06_abstract_interface.myshape;

public abstract class Shape {
    // 일반화 : 모든 도형에서 사용하는 면적, 둘레, 라인 색상, 채우기 색상등은 수퍼 클래스에서 사용한다.
    protected double area; // 면적
    protected double perimeter; // 도형의 둘레
    private String linecolor; // 라인 색상
    private String fillcolor; // 채우기 색상

    // final 메소드는 오버라이딩을 하지 못하도록 막고자 할 때 사용
    final void drow() {
        System.out.println("라인 색상 : " + linecolor);
        System.out.println("채우기 색상 : " + fillcolor);
    }

    // 내용이 정의되지 않은 모델 개념으로, 불완전한 메소드
    public abstract double calcArea();
    public abstract double calcPerimeter();
    public abstract void display();

    public Shape() {
    }

    public Shape(String linecolor, String fillcolor) {
        this.linecolor = linecolor;
        this.fillcolor = fillcolor;
    }

    //    public final draw();
    //    abstract calcArea();
    //    abstract calcPerimeter();
    //    abstract display();
}
