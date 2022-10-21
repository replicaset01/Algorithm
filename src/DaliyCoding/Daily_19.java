package DaliyCoding;
// 19. 암호화된 문자열과 암호화 키를 입력받아 복호화된 문자열을 리턴
public class Daily_19 {
    public static String decryptCaesarCipher(String str, int secret) {
        // TODO:
        String result = "";
        int num = 0;

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            // c가 빈 문자열이 아닐때
            if (c != ' ') {
                // 아스키 코드표 상에서 secret의 개수만큼 빼준다
                num = (int) c - secret;
                // str의 요소가 97(a) 보다 작으면
                if (num < 97) {
                    // 알파벳의 개수인 26을 더해준다
                    num = num + 26;
                }
                // c = num의 숫자에 해당하는 문자 반환
                c = (char) num;
            }
            result = result + c;
        }
        return result;
    }

    public static void main(String[] args) {
        String output = decryptCaesarCipher("khoor", 3);
        System.out.println(output); // --> hello

        output = decryptCaesarCipher("zruog", 3);
        System.out.println(output); // --> world
    }
}
