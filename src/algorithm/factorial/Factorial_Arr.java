package algorithm.factorial;

import java.util.Scanner;

public class Factorial_Arr {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //입력받은 값 n
        int n = in.nextInt();

        //피보나치수열을 담을 배열 생성
        int[] answer = new int[n];

        //ex) 1 1 2 3 5 8 13 .....
        answer[0] = 1; //배열 0번째는 1
        answer[1] = 1; //배열 1번째는 1

        //for문은 배열의 2번째부터 시작
        for(int i=2;i<n;i++) {
            //피보나치수열은 해당 수열의 항의 앞의 두자리 값의 합과 동일함.
            answer[i] = answer[i-2] + answer[i-1];
        }

        //출력
        for(int x : answer) {
            System.out.print(x + " ");
        }
    }
}
