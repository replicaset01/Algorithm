package DaliyCoding;
// 5. 문자열을 입력받아 순서가 뒤집한 문자열 리턴
public class Daily_5 {
    public static String firstReverse(String str) {
        String a = new StringBuffer(str).reverse().toString();
        return a;
    }

    public static void main(String[] args) {
        String output = firstReverse("codestates");
        System.out.println(output); // "setatsedoc"

        output = firstReverse("I love codestates");
        System.out.println(output); // "setatsedoc evol I"
    }
}
