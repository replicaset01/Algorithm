package algorithm.fibonacci;

public class Fibonacci_arr {
    public static void main(String[] args) {
        // 결과 값을 담을 배열 선언
        final int[] arr = new int[100];

        // 첫번째 항과 두번째 항 미리 선언
        arr[1]=1;
        arr[2]=1;

        // 반복문을 이용하여 A(n)=A(n-1)+A(N-2)를 계속 더함
        for (int i=3; i<100; i++) {
            arr[i]=arr[i-1] + arr[i-2];
            System.out.println(arr[i] + " ");
        }
    }
}