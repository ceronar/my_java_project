package ch07_collection.crudboard;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

// 데이터 베으스에게 데이터를 추가/수정/삭제 등의 작업을 요청해주는 중간 middle-wara 성격의 클래스
public class BoardDao {
    private List<Board> boardList = null; // 게시물들을 담는 통(bottle)

    public BoardDao() {
        this.boardList = new ArrayList<Board>();
    }

    public int insertData(Board board) {
        System.out.println("게시물 번호 " + board.getNo() + "이(가) 추가 됩니다.");
        boardList.add(board);
        return 1;
    }

    public int getSize() {
        return boardList.size();
    }

    public List<Board> selectAll() {
        return boardList;
    }

    public Board getOne(int findId) {
        // findId는 찾고자 하는 게시물 번호
        Board findData = null; // 반환해줄 데이터 정보
        for (Board bean : boardList) {
            if (bean.getNo() == findId) { // 해당 게시물 발견
                findData = bean; // 해당 객체를 반환하는 데이터에 할당
                break; // 이하 다른 게시물을 볼 필요 없음
            }
        }
        return findData;
        // return boardList.stream().filter(n->n.getNo()==findId).findFirst().orElse(null);
    }

    public int updateData(Board board) {
        int result = 0;
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).getNo() == board.getNo()) { // 해당 게시물 발견
                boardList.set(i, board); // 이전 게시물 index에 업데이트
                result = 1;
                break; // 이하 다른 게시물을 볼 필요 없음
            }
        }
        return result;
    }

    public int removeData(int deleteId) {
        // deleteId는 삭제하고자 하는 게시물 발견
        int cnt = -1; // -1은 '발견' 여부를 나타내는 flag 변수
        for (Board bean : boardList) {
            if (deleteId == bean.getNo()) { // 발견됨
                boardList.remove(bean);
                cnt = 1;
                break;
            } else { // 발견 못함

            }
        }
        return cnt;
    }

    public void deleteAllData() {
        boardList.clear();
    }
}
