package ch02_control_statement;

public class MultiIf01 {
    public static void main(String[] args) {
        int temperature = 37;

        String info = "";
        if(temperature >= 35){
            info = "폭염경보";
        } else if(temperature >= 30){
            info = "무더운 날씨";
        } else if(temperature >= 20){
            info = "쾌적한 날씨";
        } else if(temperature >= 10){
            info = "쌀쌀한 날씨";
        } else {
            info = "추운 날씨";
        }

        System.out.println(temperature + "도는 " + info + "입니다.");

        /*
            파일 : MultiIf01.java

            int temperature = 24;

            35도 이상 : "폭염 경보"
            30도 이상 : "무더운 날씨"
            20도 이상 : "쾌적한 날씨"
            10도 이상 : "쌀쌀한 날씨"
            이외 : "추운 날씨"

            출력 예시 : 24도는 쾌적한 날씨입니다.
        * */
    }
}
