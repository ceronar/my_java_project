import java.util.ArrayList;
import java.util.Collections;

class TestCodeMain {
    public static void main(String[] args) {



    }

    class Solution {
        public String solution(String X, String Y) {
            StringBuilder answer = new StringBuilder();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < X.length(); i++) {
                String temp = X.substring(i, i+1);
                if(Y.contains(temp)){
                    Y = Y.replaceFirst(temp, "");
                    list.add(Integer.valueOf(temp));
                }
            }
            list.sort(Collections.reverseOrder());
            for(int i : list) {
                answer.append(i);
            }
            if(answer.toString().isEmpty()) {
                answer = new StringBuilder("-1");
            } else if(answer.toString().matches("^00$")){
                answer = new StringBuilder("0");
            }
            return answer.toString();
        }
    }
}
