package DaliyCoding;
// 14. 수를 요소로 갖는 배열을 입력받아 각 요소들이 그 이전의 요소들의 합보다 큰지 여부를 리턴
public class Daily_14 {
    public static boolean superIncreasing(int[] arr) {
        // TODO:
        boolean result = true;
        int sum = 0;

        for (int i=0; i<arr.length; i++) {
            for (int j=1; j<arr.length-1; j++) {
                sum = sum + arr[i];
                if (arr[j] < arr[i]) {
                    result = false;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean output = superIncreasing(new int[]{1, 3, 6, 13, 54});
        System.out.println(output); // --> true

        output = superIncreasing(new int[]{1, 3, 5, 9});
        System.out.println(output); // --> false
    }
}
