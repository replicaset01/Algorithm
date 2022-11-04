package DaliyCoding;
/*
두 개의 배열(base, sample)을 입력받아 sample이 base의 부분집합인지 여부를 리턴해야 합니다.
 */
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Daily_24 {
    public boolean isSubsetOf(int[] base, int[] sample) {
        //배열을 List로 변경후, List.contains 명령어를 사용하여 중복여부 검사
        List<Integer> intList
                = Arrays.stream(base)
                .boxed()
                .collect(Collectors.toList());

        for (int i : sample) {
            if (!intList.contains(i)) {
                return false;
            }
        }
        return true;
    }
}
