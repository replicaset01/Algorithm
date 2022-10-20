package DaliyCoding;

import java.util.HashMap;
// 7. 2차원 배열(배열을 요소로 갖는 배열)을 입력받아 각 배열을 이용해 만든 HashMap을 리턴
public class Daily_7 {
    public HashMap<String, String> convertListToHashMap(String[][] arr) {
        HashMap<String, String> result = new HashMap<>();
        if(arr.length == 0) return result; // 비어있을떄;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length != 0) {     //  i요소의 길이가 0이 아닐때
                if(!result.containsKey(arr[i][0])) {
                    result.put(arr[i][0], arr[i][1]); // 1번재 배열에 i,0 2번쨰에 i,1
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"make", "Ford"},
                {"model", "Mustang"},
                {"year", "1964"},
                {"make", "Bill"},
        };
    }
}
