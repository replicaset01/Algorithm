package DaliyCoding;

/**
 * 정수를 요소로 갖는 배열을 입력받아 오름차순으로 정렬하여 리턴해야 합니다.
 */
public class Daily_36 {
    // public int[] insertionSort(int[] arr) {
    //   for (int index = 1; index < arr.length; index++) {
    //     for (int target = index; target > 0; target--) {
    //       if (arr[target - 1] > arr[target]){
    //         int temp = arr[target - 1];
    //         arr[target - 1] = arr[target];
    //         arr[target] = temp;
    //       }
    //     }
    //   }
    //   return arr;
    // }

    /**
     * 최적화를 적용한 코드
     * 삽입정렬에서 기존 정렬 과정에서 이미 정렬이 이루어진 범위보다 큰 수를 비교할 경우,
     * 앞서서 이미 정렬한 숫자와 비교할 필요가 없습니다.
     * 불필요한 과정을 줄일 수 있는 최적화 과정이 적용된 코드입니다.
     **/

    public int[] insertionSort(int[] arr) {
        for (int index = 1; index < arr.length; index++) {
            int target = index;
            while (target > 0 && arr[target - 1] > arr[target]) {
                int temp = arr[target - 1];
                arr[target - 1] = arr[target];
                arr[target] = temp;
                target--;
            }
        }
        return arr;
    }
}