package ch07_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> teamMap = new HashMap<>();

        teamMap.put("lg", 1);
        teamMap.put("ssg", 2);
        teamMap.put("두산", 3);
        teamMap.put("kt", 4);

        String findItem = "nc";
        boolean bool = teamMap.containsKey(findItem);
        System.out.println(findItem + "팀이 목록에 " + ((bool)?"있습니다.":"없습니다."));

        // nc 팀이 존재하는 지 체크하고, 없으면 순위 5위로 추가
        if (!teamMap.containsKey("nc")) {
            teamMap.put("nc", 5);
        }

        // 순위가 6위인 팀이 존재하는지 체크하고, 존재하지 않으면 'kia'를 6위로 추가
        // 존재 여부를 적절한 문구로 출력
        int pos = 6; // 순위
        if (!teamMap.containsValue(pos)) {
            System.out.println(pos + "위인 팀이 없어 추가합니다.");
            teamMap.put("kia", pos++);
        } else {
            System.out.println(pos + "위인 팀이 있습니다.");
        }

        String[] teams = {"롯데", "한화", "키움", "삼성"};
        for (int i = 0; i < teams.length; i++) {
            teamMap.put(teams[i], i+7);
            pos++;
        }

        findItem = "한화";
        Integer rank = teamMap.get(findItem);

        if(rank == null) {
            System.out.println(findItem + "팀은 존재하지 않습니다.");
        } else {
            System.out.println(findItem + "는(은) " + rank + "등 입니다.");
        }

        System.out.println("다음 팀들의 순위 정보를 출력");
        String[] findTeams = {"두산", "kt", "빙그레"};
        for (String team : findTeams) {
            rank = teamMap.get(team);
            if(rank == null) {
                System.out.println(team + "팀이 없어 추가합니다.");
                teamMap.put(team, pos++);
            } else {
                System.out.println(team + "는(은) " + rank + "등 입니다.");
            }
        }

        System.out.println("전체 목록 출력");
        // teamMap.keySet(); // 반환타입 Set으로 전체 key 목록 반환 / 현재 key가 String 이므로 Set<String>
        Set<String> items = teamMap.keySet();
        for (String key : items){
            System.out.println(key + " : " + teamMap.get(key));
        }
        /*
        * for (String str : teamMap.keySet()){
        *   System.out.println(str + " : " + teamMap.get(str));
        * }
        */

        /*
        teamMap.forEach((key, value) -> {
            System.out.println(key + " : " + value + "등");
        });
         */

        System.out.println("요소 크기 : " + teamMap.size());
        // System.out.println(teamMap); // {kia=6, 한화=8, nc=5, ssg=2, 두산=3, 롯데=7, 키움=9, kt=4, 빙그레=11, lg=1, 삼성=10}

        teamMap.clear();
        if(teamMap.isEmpty()) {
            System.out.println("teamMap is Empty");
        } else {
            System.out.println("teamMap is not Empty");
        }
    }
}
