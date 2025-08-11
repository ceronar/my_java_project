package ch07_collection.crudmember;

import java.util.List;

public class MemberMain {
    public static void main(String[] args) {
        MemberDao dao = new MemberDao();
        dao.insertData(new Member("kim", "김만수", 10, "남자"));
        dao.insertData(new Member("park", "박영희", 20, "여자"));
        dao.insertData(new Member("lee", "이수영", 30, "여자"));
        dao.insertData(new Member("choi", "최윤식", 40, "남자"));

        int size = dao.getSize();
        System.out.println("회원은 총 " + size + "명 입니다.");

        System.out.println("\n모든 회원 정보를 출력");
        List<Member> memberList = dao.selectAll();
        for (Member bean : memberList) {
            System.out.println(bean);
        }
        System.out.println("\n아이디를 이용하여 특정 회원 정보를 조회합니다.");
        String findId = "lee";
        Member one = dao.getOne(findId);
        if (one == null) {
            System.out.println(findId + " 아이디는 존재하지 않습니다.");
        } else {
            System.out.println(one);
        }

        System.out.println("\n특정 아이디를 사용하여 회원 정보를 삭제");
        String deleteId = "park";
        int result = dao.deleteData(deleteId);
        if (result >= 1) {
            System.out.println(deleteId + " 아이디 삭제 성공");
        } else {
            System.out.println(deleteId + " 아이디 삭제 실패");
        }

        System.out.println("\nbefore all deleted : " + dao.getSize());
        System.out.println("회원 목록 전부 삭제");
        dao.deleteAllData();
        System.out.println("\nafter all deleted : " + dao.getSize());
    }
}
