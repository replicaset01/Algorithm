package DaliyCoding;
/*
아래와 같이 정의된 피보나치 수열 중 n번째 항의 수를 리턴해야 합니다.

0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1입니다. 그 다음 2번째 피보나치 수부터는 바로 직전의 두 피보나치 수의 합으로 정의합니다.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
 */
import java.util.*;

public class Daily_23 {
    // naive solution: O(2^N)
    // public int fibonacci(int num) {
    // 	if (num <= 1) return num;
    // 	return fibonacci(num - 1) + fibonacci(num - 2);
    // }

    // dynamic with meoization: O(N)
    // 이미 해결한 문제의 정답을 따로 기록해두고,
    // 다시 해결하지 않는 기법
    // fibo(10)
    // = fibo(9) + fibo(8)
    // = fibo(8) + fibo(7) + fibo(7) + fibo(6)
    public int fibonacci(int num) {
        ArrayList<Integer> memo = new ArrayList<>();
        memo.add(0);
        memo.add(1);

        return aux(memo, num);
    }

    public int aux(ArrayList<Integer> memo, int num) {
        if (memo.size() <= num) {
            memo.add(aux(memo, num - 1) + aux(memo, num - 2));
        }
        return memo.get(num);
    }
}