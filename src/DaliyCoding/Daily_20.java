package DaliyCoding;
// 20. compressString
public class Daily_20 {
    public String compressString(String str) {
        if (str == "") return "";
        // 연속되는 문자를 기록하기 위한 변수를 선언하고, 첫번째 요소로 초기화
        char before = str.charAt(0);
        // 반복 회수를 저장할 변수 선언, 초기값은 1로 설정
        int count = 1;
        // 정답으로 리턴할 문자열 선언
        String result = "";
        // 마지막 부분이 연속된 문자일 경우를 위해 더미 문자 추가
        str = str + ' ';

        // 첫 문자를 제외한 문자 순회
        for (int i = 1; i < str.length(); i++) {
            // 동일한 문자가 반복될 경우 count에 1 추가
            if (before == str.charAt(i)) {
                count++;
                // 같은 문자가 아닐 경우
            } else {
                if (count >= 3) {
                    result = result + count + before;
                } else {
                    // count의 수만큼 결과에 문자열 저장
                    for (int j = 0; j < count; j++) {
                        result = result + before;
                    }
                }
                before = str.charAt(i);
                count = 1;
            }
        }
        return result;
    }
}
