package ch02_control_statement;

public class If04 {
    public static void main(String[] args) {
        int score = 86;

        if (score >= 90) {
            System.out.println("A 학점");
        } else if (score >= 80) {
            System.out.println("B 학점");
        } else if (score >= 70) {
            System.out.println("C 학점");
        } else if (score >= 60) {
            System.out.println("D 학점");
        } else {
            System.out.println("F 학점");
        }

        String grade = "";
        switch (score/10) {
            case 10:
            case 9 : grade = "A 학점"; break;
            case 8 : grade = "B 학점"; break;
            case 7 : grade = "C 학점"; break;
            case 6 : grade = "D 학점"; break;
            default: grade = "F 학점";
        }
        System.out.println(grade);

    }
}
