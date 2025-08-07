package ch06_abstract_interface.animaltest;

public class Unicon extends Animal implements Horse, Bird {
    private String name; // 이름
    private String gender; // 성별
    private String food; // 사료

    private int initspeed; // 초기속도

    @Override
    public void flutter() {
        String message = name + "이(가) 화려하게 날개를 퍼덕입니다.";
        // Bird.super.flutter();
        System.out.println(message);
    }

    public Unicon() {
    }

    public Unicon(String name, String gender, String food) {
        this.name = name;
        this.gender = gender;
        this.food = food;

        if(this.gender.equals("M")) {
            this.initspeed = Bird.speed;
        } else {
            this.initspeed = Horse.speed;
        }
    }

    @Override
    public void fly() {
        String message = "'" + name + "'이(가) 시속 " + Bird.speed + "의 속도로 달립니다.";
        System.out.println(message);
    }

    @Override
    public void run() {
        String message = "'" + name + "'이(가) 시속 " + Horse.speed + "의 속도로 달립니다.";
        System.out.println(message);
    }

    @Override
    public void eat() {
        String message = "'" + name + "'이(가) '" + food + "'을(를) 먹습니다.";
        System.out.println(message);
    }

    public void display() {
        String message = name + "의 초기 속도는 " + initspeed + "입니다";
        System.out.println(message);
        this.run();
        this.eat();
        this.fly();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Unicon{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
