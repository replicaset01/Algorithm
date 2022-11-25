package DaliyCoding;
// binarySearch
/* 오름차순 정렬된 정수의 배열(arr)과 정수(target)를 입력받아 target의 인덱스를 리턴해야 합니다. */
public class Daily_41 {
    public int binarySearch(int[] arr, int target) {
        // 좌측 기준점
        int left = 0;
        // 우측 기준점
        int right = arr.length - 1;
        // 기준점이 서로에게 도달할때까지 반복합니다.
        while (left <= right) {
            // 중앙 기준점
            int middle = (right + left) / 2;
            // 현재 기준이 타겟과 일치한다면 해당 값을 반환합니다.
            if (arr[middle] == target) return middle;
            // 기준점보다 크다면 우측을 줄이고
            if (target < arr[middle]) {
                right = middle - 1;
                //기준점보다 작다면 좌측을 줄입니다.
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
