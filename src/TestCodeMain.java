class TestCodeMain {
    public static void main(String[] args) {



    }

    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i <= 3; i++) {
            for(int j = 0; j < food[i]/2; j++) {
                answer.append(i);
            }
        }
        answer.append("0");
        for(int i = 3; i >= 1; i--) {
            for(int j = 0; j < food[i]/2; j++) {
                answer.append(i);
            }
        }
        System.out.println(answer);
        return answer.toString();
    }
}
