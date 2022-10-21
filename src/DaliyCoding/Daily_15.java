package DaliyCoding;
// 15. 두 수(num1, num2)를 입력받아, num1를 num2로 나눈 나머지를 리턴
public class Daily_15 {
    public static Integer modulo(int num1, int num2) {
        if(num2 == 0) { // num1을 0으로 나눌경우
            return null;
        }

        while (num1 >= num2) {  /* num1 이 크거나 같은경우 */
            num1 = num1 - num2;   /* num1을 25로 가정하면 25 에서 4씩 뺸 나머지 */
        }

        return num1;
    }

    public static void main(String[] args) {
        Integer output = modulo(25, 4);
        System.out.println(output); // --> 1

        output = modulo(25, 0);
        System.out.println(output); // --> null
    }
}
