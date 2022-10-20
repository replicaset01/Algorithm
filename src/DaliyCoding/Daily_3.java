package DaliyCoding;
// 3. 수를 입력받아 2의 거듭제곱인지 여부를 리턴
public class Daily_3 {
    public static boolean powerOfTwo(long num) {
        if (num == 1) return true; // 2의 0승 = true
        if (num % 2 != 0) return false; // 2의 거듭제곱이 아니면 false

        long a = 2;
        while (a<num) { // a 가 입력값보다 작을때 *2 계속 반복
            a = a*2;
        }
        return a==num;  // a가 입력값과 같아지면 2의 거듭제곱이니 true 리턴
    }

    public static void main(String[] args) {
        boolean output1 = powerOfTwo(16);
        System.out.println(output1);
        boolean output2 = powerOfTwo(22);
        System.out.println(output2);
    }
}
