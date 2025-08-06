import java.util.*;

class TestCodeMain {
    public static void main(String[] args) {



    }

    class Solution {
        public String solution(String X, String Y) {
            StringBuilder answer = new StringBuilder();
            HashMap<Integer, Integer> mapX = new HashMap();
            HashMap<Integer, Integer> mapY = new HashMap();
            char[] arrX = X.toCharArray();
            char[] arrY = Y.toCharArray();
            for(int i = 0; i < arrX.length; i++) {
                if(mapX.containsKey((int)arrX[i])){
                    int count = (int)mapX.get((int)arrX[i]);
                    mapX.put((int)arrX[i], count + 1);
                } else {
                    mapX.put((int)arrX[i], 1);
                }
            }
            for(int i = 0; i < arrY.length; i++) {
                if(mapY.containsKey((int)arrY[i])){
                    int count = (int)mapY.get((int)arrY[i]);
                    mapY.put((int)arrY[i], count + 1);
                } else {
                    mapY.put((int)arrY[i], 1);
                }
            }
            for(int i = 9; i >= 0; i--) {
                if(mapX.containsKey(i) && mapY.containsKey(i)) {
                    System.out.print(1);
                    int count = Math.min((int)mapX.get(i), (int)mapY.get(i));
                    for(int j = 0; j < count; j++) {
                        answer.append(i);
                    }
                }
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
