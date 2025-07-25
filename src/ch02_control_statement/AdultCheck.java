package ch02_control_statement;

public class AdultCheck {
    public static void main(String[] args) {
        String name = "홍길동";
        int age = 25;
        int _gender = 4; // 주민번호 뒷자리 성별
        // String gender = ""; // 성별(한글)
        // String adult = ""; // 미성년자 여부 문자열

        String message = "이름 : " + name + "님, 나이 : " + age + "세, 성인체크 : ";
        if(age >= 19) {
            // adult = "성인";
            message += "성인";
        } else {
            // adult = "미성년자";
            message += "미성년자";
        }
        message += ", 성별 : ";
        if(_gender == 1 || _gender == 3) {
            // gender = "남자";
            message += "남자";
        } else {
            // gender = "여자";
            message += "여자";
        }
        System.out.println(message);
        // System.out.printf("이름 : %s님, 나이 : %d세, 성인 체크 : %s, 성별 : %s", name, age, adult, gender) ;
    }
}
