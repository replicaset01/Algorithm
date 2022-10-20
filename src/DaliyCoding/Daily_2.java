package DaliyCoding;
// 연이율을 입력받아 원금이 2배 이상이 될때까지 걸리는 시간(년) 리턴
public class Daily_2 {
    public static int computeWhenDouble(double interestRate) {
        double rate = 1 + interestRate / 100;
        double principal = 1;
        int year = 0;
        while (principal < 2) {
            principal = principal * rate;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        int output = computeWhenDouble(7);
        System.out.println(output);

        output = computeWhenDouble(10);
        System.out.println(output);
    }
}
