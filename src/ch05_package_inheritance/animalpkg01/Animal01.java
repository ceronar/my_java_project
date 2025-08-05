package ch05_package_inheritance.animalpkg01;

public class Animal01 {
    // 이름(name)/평균 수명(lifespan)/서식지(habitat)/속도(speed)
    private String name;
    private int lifespan;
    private String habitat;
    private int speed;

    public void showInfo() {
        System.out.println("평균 수명이 " + lifespan + "인 " + name + "의 서식지는 " + habitat + "입니다.");
    }

    public Animal01() {}
    public Animal01(String name, int lifespan, String habitat, int speed) {
        this.name = name;
        this.lifespan = lifespan;
        this.habitat = habitat;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLifespan() {
        return lifespan;
    }
    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
