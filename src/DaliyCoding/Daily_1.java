package DaliyCoding;

import java.util.HashMap;
// 1. 배열을 입력받아 차례대로 배열의 첫 요소와 마지막 요소를 키,값으로 하는 HashMap 리턴
public class Daily_1 {
    public static HashMap<String, String> transformFirstAndLast(String[] arr) {
        // hashmap<string,string> 리턴
        // 빈배열은 null 리턴
        // 입력받는 배열 수정 X

        if (arr.length==0)
            return null;

        HashMap<String, String> a = new HashMap<>();
        a.put(arr[0], arr[arr.length - 1]);
        return a;
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"Queen", "Elizabeth", "Of Hearts", "Beyonce"};
        HashMap<String, String> output = transformFirstAndLast(arr);
        System.out.println(output);

//        String[] arr = new String[]{"Kevin", "Bacon", "Love", "Hart", "Costner", "Spacey"};
//        HashMap<String, String> output = transformFirstAndLast(arr);
//        System.out.println(output);
    }
}
