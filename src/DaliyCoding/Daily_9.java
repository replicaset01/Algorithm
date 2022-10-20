package DaliyCoding;
// 9, 문자열을 입력받아 문자열 내에 아래 중 하나가 존재하는지 여부를 리턴해야함
//     'a'로 시작해서 'b'로 끝나는 길이 5의 문자열
//     'b'로 시작해서 'a'로 끝나는 길이 5의 문자열
public class Daily_9 {
    public static boolean ABCheck(String str) {
        if(str.length() == 0) {
            return false;
        }
        str = str.toLowerCase();

        for(int i = 4; i < str.length(); i++) {
            if((str.charAt(i) == 'a' && str.charAt(i - 4) == 'b') || (str.charAt(i) == 'b' && str.charAt(i - 4) == 'a')) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        boolean output = ABCheck("lane Borrowed");
        System.out.println(output); // --> true
    }
}
