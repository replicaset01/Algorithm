package DaliyCoding;
// 6. 문자열을 입력받아 문자열을 구성하는 각 단어의 첫 글자가 대문자인 문자열을 리턴
public class Daily_6 {
    public static String letterCapitalize(String str) {
        if(str.length() == 0) return "";

        String[] words = str.split(" ");  // 문자열을 " "으로 구분하기
        String result = ""; // 결과값은 ""로 설정해두고

        for(int i = 0; i < words.length; i++) {
            if(words[i].isEmpty()) {   // 문자열의 i번째요소가 비었을때
                words[i] = words[i];     // ??
            } else {
                words[i] = String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
                // valueof = 스트링으로 변환
                // toUpperCase = 대문자로 변환
                // subString = 문자열 자르기
            }
        }

        result = String.join(" ", words);
        return result;
    }

    public static void main(String[] args) {
        String output1 = letterCapitalize("hello world");
        System.out.println(output1); // "Hello World"
        String output2 = letterCapitalize("java  is good");
        System.out.println(output2); // "Java  Is Good"
    }
}
