package ch04_class;

public class Saram03 {
    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    public Saram03() {}

    public Saram03(String name, double height, double weight, String blood, String hobby) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.blood = blood;
        this.hobby = hobby;
    }

    // 접근제한자 반환타입 메소드이름(매개변수) {}
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
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "--- 정보 ---\n" +
                "이름 \t: " + name    + '\n' +
                "키 \t\t: " + height  + '\n' +
                "몸무게 \t: " + weight  + '\n' +
                "취미 \t: " + hobby   + '\n' +
                "혈액형 \t: " + blood + '\n';
    }

}
