package ch07_collection.crudmember;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MemberDao {
    private List<Member> memberList = null; // 회원 목록을 담을 컬렉션

    public MemberDao() {
        this.memberList = new ArrayList<>();
    }

    public int insertData(Member member) { // 회원 1명 추가하기
        System.out.println("아이디가 " + member.getId() + " 회원 가입 완료");
        memberList.add(member);
        return 1;
    }

    public int getSize() {
        return memberList.size();
    }

    public int updateData(Member member) {
        return 0;
    }

    public List<Member> selectAll() {
        return memberList;
    }

    public Member getOne(String findId) {
        // 특정 아이디 findId를 사용하여 회원이 존재하는지 검색하고 존재하면 객체 없으면 null 리턴
        Member who = null; // 발견되면 여기에 값 할당
        for (Member m : memberList) {
            if (m.getId().equals(findId)) {
                who = m;
                break;
            }
        }
        return who;
        // return memberList.stream().filter(m->m.getId().equals(id)).findFirst().orElse(null);
    }

    public int deleteData(String deleteId) {
        int result = 0;
        for (Member m : memberList) {
            if (deleteId.equals(m.getId())) {
                memberList.remove(m);
                result = 1;
                break;
            }
        }
        /*
        for (int i = 0; i < memberList.size(); i++) {
            if (memberList.get(i).getId().equals(deleteId)) {
                memberList.remove(i);
                result = 1;
                break;
            }
        }
         */
        return result;
    }

    public void deleteAllData() {
        memberList.clear();
    }
}
