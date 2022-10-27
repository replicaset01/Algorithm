package DaliyCoding;

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
