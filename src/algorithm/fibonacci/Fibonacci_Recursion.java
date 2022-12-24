package algorithm.fibonacci;

public class Fibonacci_Recursion {
    // 피보나치 수열을 입력받은 숫자 개수만큼 출력
    public static void main(String[] args) {
        int input = 8;

        for (int i=1; i<=input; i++) {
            System.out.println(fibo(i));
        }
    }

    public static int fibo(int n) {
        if (n<=1)
            return n;
        else return fibo(n-2) + fibo(n-1);
    }


}