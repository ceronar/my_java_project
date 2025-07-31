package ch04_class;

public class OverAdd {
    // 반환타입 이름(매개변수) {...}
    public int Add(int a, int b, int c) {
        return a + b + c;
    }
    public void Add(int a, int b) {
        System.out.println("정수 덧셈 : " + (a + b));
    }
    public void Add(int a, double x) {
        System.out.println("정수 실수 덧셈 : " + (a + x));
    }
    public void Add(double x, double y) {
        System.out.println("실수 덧셈 : " + (x + y));
    }
}
