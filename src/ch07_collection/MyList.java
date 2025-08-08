package ch07_collection;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> coffeeList = new ArrayList<>();
        coffeeList.add("아메리카노");
        coffeeList.add("카페라떼");
        coffeeList.add("에스프레소");
        coffeeList.add("마키아또");
        coffeeList.add("카페라떼");

        int idx = -1;
        String findData = "카페라떼";
        idx = coffeeList.indexOf(findData);
        System.out.println(findData + "의 인덱스 번호 : " + idx);

        idx = coffeeList.lastIndexOf(findData);
        System.out.println(findData + "의 인덱스 번호 : " + idx);

        findData = "카푸치노";
        idx = coffeeList.indexOf(findData);
        System.out.println(findData + "의 인덱스 번호 : " + idx);

        // "카푸치노" 항목이 존재하지 않으면, 2번째 인덱스에 추가해 보세요
        findData = "카푸치노";
        if (!coffeeList.contains(findData)) {
            coffeeList.add(2, findData);
        }

        System.out.println("확장 for 구문을 이용한 출력");
        for(String str : coffeeList) {
            System.out.printf(str + " ");
        }
        System.out.println();

        findData = "콜드브루";
        coffeeList.set(5, findData); // 인덱스에 있는 항목 교체

        findData = "카푸치노";
        coffeeList.remove(findData); // 특정값 제거

        coffeeList.add(findData); // 추가

        for(String coffee : coffeeList) {
            System.out.printf(coffee + " ");
        }
        System.out.println();

        System.out.println("일반 for 구문으로 요소 출력하기");
        for (int i = 0; i < coffeeList.size(); i++) {
            System.out.print(coffeeList.get(i) + " ");
        }
        System.out.println();

        System.out.println("요소 크기 : " + coffeeList.size());
    }
}
