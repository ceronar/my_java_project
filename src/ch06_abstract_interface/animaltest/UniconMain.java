package ch06_abstract_interface.animaltest;

public class UniconMain {
    public static void main(String[] args) {
        Unicon unidol = new Unicon("유니돌", "M", "당근");
        unidol.display();
        unidol.flutter();

        System.out.println();

        Unicon unisoon = new Unicon("유니순", "F", "건초");
        unisoon.display();

        // 다형성 테스트
        // Unicon을 Animal, Horse, Bird 타입으로 다뤄보자
        // 승급
        Animal animal = new Unicon("다형성", "M", "사과");
        animal.eat();

        Horse horse = (Horse) animal;
        horse.run();

        Bird bird = (Bird) animal;
        bird.fly();
    }
}
