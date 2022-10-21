package DaliyCoding;
// 16. 문자열을 입력받아 아이소그램인지 여부를 리턴해야 합니다.
// 아이소그램(isogram)은 각 알파벳을 한번씩만 이용해서 만든 단어나 문구를 말합니다.
public class Daily_16 {
    public static boolean isIsogram(String str) {
        // TODO:
        str = str.toLowerCase();
        if (str == "") {
            return true;
        }

        for(int i=0; i<str.length(); i++) {
            for(int j=i+1; j<str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean output = isIsogram("aba");
        System.out.println(output); // false

        output = isIsogram("Dermatoglyphics");
        System.out.println(output); // true

        output = isIsogram("moOse");
        System.out.println(output); // false
    }
}
