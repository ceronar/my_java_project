package ch03_array;

public class MyArr01 {
    public static void main(String[] args) {
        // 정수 데이터 25개를 취급하기 위한 배열 score 선언
        // int[] score = new int[25];

        int x = 3;
        int y = 5;

        // 정수 데이터 3개를 취급하기 위한 배열
        int[] arr = new int[3];

        arr[0] = x - y + 6;
        arr[2] = arr[0] + 3;
        arr[1] = arr[0] + arr[2];

        System.out.println("요소들 출력");

        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        /*
        for (int i : arr) {
            System.out.println(i);
        }
         */

        System.out.println("배열 초기화 기법");

        int[] arr2 = {50, 20, 30};

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }

    }
}
