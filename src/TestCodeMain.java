import java.util.*;
import java.util.regex.Pattern;

class TestCodeMain {

    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));
        // 를 평탄화하여 하나의 리스트로 만드세요.
        List<String> list = listOfLists.stream()
                                        .flatMap(List::stream)
                                        .toList();
    }

}
