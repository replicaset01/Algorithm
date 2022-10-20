package DaliyCoding;
// 8. 문자열을 입력받아 해당 문자열에 등장하는 두 칸의 공백을 모두 한 칸의 공백으로 바꾼 문자열을 리턴
public class Daily_8 {
    public static String convertDoubleSpaceToSingle(String str) {
        String[] words = str.split("  "); // 문자열을 공백 2칸으로 구분
        return String.join(" ", words); // replaceAll이 아닌 join을 사용 , join() = 배열을 문자열로 합쳐줌
    }

    public static void main(String[] args) {
        String output = convertDoubleSpaceToSingle("string  with  double  spaces");
        System.out.println(output); // --> "string with double spaces"
    }
}
