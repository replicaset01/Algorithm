package DaliyCoding;
// 10. 문자열을 입력받아 연속된 한자리 홀수 숫자 사이에 '-'를 추가한 문자열을 리턴
public class Daily_10 {
    public static String insertDash(String str) {
        if(str.length() == 0) {
            return null;
        }
        String result = "" + str.charAt(0);

        for(int i = 1; i < str.length(); i++) {
            int preNumber = Character.getNumericValue(str.charAt(i - 1)) % 2;
            int curNumber = Character.getNumericValue(str.charAt(i)) % 2;
            if(preNumber != 0 && curNumber != 0) {
                result = result + "-";
            }
            result = result + str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String output = insertDash("454793");
        System.out.println(output); // --> 4547-9-3
    }
}
