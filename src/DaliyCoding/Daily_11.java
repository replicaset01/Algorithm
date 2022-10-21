package DaliyCoding;
// 11. 문자열을 요소로 갖는 배열을 입력받아 가장 짧은 문자열과 가장 긴 문자열을 제거한 배열을 리턴
public class Daily_11 {
    public static String[] removeExtremes(String[] arr) {
        // TODO:

        // 공백 입력받으면 null 반환
        if (arr.length == 0) {
            return null;
        }

        // 가장 짧은문자열의 길이 =! 가장긴문자열의 길이
        // if (가장 짧문자 or 가장 긴문자 == 다수) return 나중에 위치한 문자열
        // arr[i].length == 20 이하

        int shortestLen = 20; // 최대 길이는 20
        int longestLen = 0;   // 최소 길이는 0
        int shortestIdx = 0;  // 가장 작은 인덱
        int longestIdx = 0;   // 가장 큰 인덱스


        for (int i = 0; i < arr.length; i++) {  //배열의 길이만큼 순회하면서

            if (arr[i].length() >= longestLen) {  //해당 요소(문자열)이 longestLen보다 클때
                longestLen = arr[i].length(); 			//longestLen에 현재 문자열의 길이를 넣어주고
                longestIdx = i; 										//longestIdx에 현재 인덱스를 넣어줍니다.
            }

            if (arr[i].length() <= shortestLen) { //같은 방식으로 최소 문자열과 인덱스를 찾아 대입합니다.
                shortestLen = arr[i].length();
                shortestIdx = i;
            }
        }
        //결과를 넣어줄 새로운 배열을 선언합니다. 최소 문자열과 최대 문자열을 제외하기 떄문에 -2만큼의 배열을 선언합니다.
        String[] result = new String[arr.length - 2];
        int curIndex = 0;

        for (int i = 0; i < arr.length; i++) { //배열을 순회하며 결과를 넣어준 후
            if (i != shortestIdx && i != longestIdx) {
                result[curIndex] = arr[i];
                curIndex++;
            }
        }
        return result; //결과를 리턴합니다.
    }

    public static void main(String[] args) {
        String[] output = removeExtremes(new String[]{"a", "b", "c", "def"});
        System.out.println(output); // --> ["a"', "b"]

        output = removeExtremes(new String[]{"where", "is", "the", "longest", "word"});
        System.out.println(output); // --> ["where", "the", "word"]
    }
}
