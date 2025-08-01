package ch04_class;

import java.util.Scanner;

public class Saram04 {
    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    Scanner sc = null; // 이런 변수가 있다고 선언

    public Saram04() {
        this.name = "김철수";
        sc = new Scanner(System.in); // 해당 장치를 생성자에서 초기화 시킴
    }

    public Saram04(String name, double height, double weight, String hobby, String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;
    }

    public Saram04(String name, double height, double weight, String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = "볼링";
        this.blood = blood;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String getBlood() {
        return blood;
    }
    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void display() {
        System.out.println("이름 : " + this.name);
        System.out.println("키 : " + this.height);
        System.out.println("몸무게 : " + this.weight);
        System.out.println("취미 : " + this.hobby);
        System.out.println("혈액형 : " + this.blood);

//        if(sc != null) {
//            System.out.print("정수 입력 : ");
//            int num = this.sc.nextInt();
//            System.out.println("입력된 정수 : " + num);
//        }
    }
}
