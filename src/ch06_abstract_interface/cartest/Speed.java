package ch06_abstract_interface.cartest;

public interface Speed {
    public static int ALLOWED_MAX_SPEED = 50 ; // 주행 가능한 최대 허용 속도

    public abstract void speedUp(int su) ; // 가속기(su만큼 누적 하기)
    public abstract void speedDown(int su) ; // 감속기(su만큼 누적 하기)
}
