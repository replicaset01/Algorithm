package DaliyCoding;
// 4. 문자열으 입력받아 문자열을 구성하는 각 단어의 첫 글자로 이루어진 문자열 리턴
public class Daily_4 {
    public static String firstCharacter(String str) {
        // 단어는 공백 한칸으로 구분
        // 연속된 공백은 X
        // 빈 문자열 = 빈문자열 리턴

        if (str.length() == 0) return "";

        String[] words = str.split(" ");
        String result = "";

        for (int i=0; i<words.length; i++) {
            result = result + words[i].charAt(0);
        }
        return result;
    }

    public static void main(String[] args) {
        String output = firstCharacter("hello world");
        System.out.println(output);

        output = firstCharacter(
                "The community at Code States might be the biggest asset"
        );
        System.out.println(output);
    }
}
