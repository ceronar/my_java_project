
package ch03_array;

public class Array02 {
    public static void main(String[] args) {
        String[] bts = {"진", "뷔", "정국", "rm", "지민", "슈가", "제이홉"};
        System.out.println("배열 요소 출력하기");
        for (int i = 0; i < bts.length; i++) {
            System.out.println("bts[" + i + "] = " + bts[i]);
        }
        for (int i = 0; i < bts.length; i++) {
            if(i != 0) System.out.print(", ");
            System.out.print(bts[i]);
        }
    }
}
