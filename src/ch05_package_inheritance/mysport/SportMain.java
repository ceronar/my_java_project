package ch05_package_inheritance.mysport;

public class SportMain {
    public static void main(String[] args) {
        FootBall football = new FootBall("축구", 11, 1, 5); // 이름, 엔트리, 하프타임, 골수
        football.display();
        BaseBall baseball = new BaseBall("야구", 9, 9, 0.412) ; // 이름, 엔트리, 이닝수, 타율
        baseball.display();
    }
}
