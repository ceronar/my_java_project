package ch07_collection;

import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<Object>();

        set.add("아메리카노");
        set.add(123);
        set.add(false);
        set.add("아메리카노");

        set.clear();

        set.add("아메리카노");
        set.add("에스프레소");
        set.add("믹스커피");
        set.add("카페라떼");

        String findData = "카푸치노";

        System.out.println(findData + " 존재 여부 : " + set.contains(findData));

        if(set.contains(findData)) {
            System.out.println(findData + " 있음");
        } else {
            System.out.println(findData + " 없음");
        }

        // 마키아또가 존재하는지 확인하고 없으면 추가
        String addData = "마키아또";
        if(!set.contains(addData)){
            set.add(addData);
        }
        // set.add(addData); // if contains 없이 그냥 적어도 됨 (Set은 중복 안됨)
        System.out.println(addData + " 존재 여부 : " + set.contains(addData));

        // remove() 메소드를 사용하여 '믹스커피'를 삭제하고 '삭제 성공'이라는 문구를 출력해 주세요.
        // 없으면 '존재하지 않음'이라는 문구를 출력해 주세요.
        System.out.println(set.remove("믹스커피") ? "삭제 성공" : "존재하지 않음");

        System.out.println("확장(향상된) for 구문을 이용한 요소 출력");
        // for(타입 단일개체 : 복수개체) { 구문 }
        for(Object obj : set) {
            System.out.printf(obj + " ");
        }
        System.out.println();
        System.out.println("요소 크기 : " + set.size());
    }
}
