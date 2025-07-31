package ch04_class;

public class ShapeArea {
    final double PI = 3.141593;
    public void area(int radius) {
        System.out.println("원의 면적 : " + (radius * radius * PI));
    }
    public void area(int width, int height) {
        System.out.println("사각형의 면적 : " + (width * height));
    }
    public void area(int top, int bottom, int height) {
        System.out.println("사다리꼴의 면적 : " + (((top+bottom)*height)/2));
    }


}
