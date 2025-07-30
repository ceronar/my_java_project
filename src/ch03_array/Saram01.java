package ch03_array;

// 단계 1 : 클래스 정의(선언)
public class Saram01 {
    // 공유하고자 하는 변수는 static 키워드를 사용
    static private String nationality;
    
    // 멤버 변수들은 기본 값이 존재
    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    public Saram01() {
    }

    public Saram01(String nationality, String name, double height, double weight, String hobby, String blood) {
        Saram01.nationality = nationality;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;
    }

    public String getNationality() {
        return nationality;
    }
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public String getHobby() {
        return hobby;
    }
    public String getBlood() {
        return blood;
    }

    public void setNationality(String nationality) {
        Saram01.nationality = nationality;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void display(){
        System.out.println(name + "님의 신상 정보");
        System.out.println("국적 : " + nationality);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height + "cm");
        System.out.println("몸무게 : " + weight + "kg");
        System.out.println("취미 : " + hobby);
        System.out.println("혈액형 : " + blood);
    }

    public void showGenderInfo(int x) {
        System.out.println(name + "님은 " +  ((x%2==1) ? "남자" : "여자") + "입니다.");
    }

    public void showBmiInfo() {
        double bmi = weight / Math.pow((height/100) , 2);
        String fat = "";
        if(bmi <= 18.5) {
            fat = "저체중";
        } else if(bmi < 23) {
            fat = "정상";
        } else if(bmi < 25) {
            fat = "과체중";
        } else if(bmi < 30) {
            fat = "1단계 비만";
        } else if(bmi < 35) {
            fat = "2단계 비만";
        } else {
            fat = "고도비만";
        }
        System.out.println(name + "님은 " + fat + "입니다.");
    }
}
