package DaliyCoding;

import java.util.Arrays;

// 12. 배열을 입력받아 순서가 뒤집힌 배열을 리턴
public class Daily_12 {
    public static int[] reverseArr(int[] arr){
        // TODO:
        if(arr.length == 0) return new int[]{}; // 빈배열 = 빈배열
        // 맨끝-1 에서 맨끝 인덱스까지
        int[] head = Arrays.copyOfRange(arr, arr.length-1, arr.length);
        // 0번 인덱스부터 맨끝-1까지
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length-1));

        // 복사 배열 = head길이 + tail길이
        int[] dest = new int[head.length + tail.length];

        // 원본배열, 복사시작위치, 복사할배열, 복사할배열의 복사시작위치, 복사할요소의 개수
        System.arraycopy(head, 0, dest, 0, head.length);
        System.arraycopy(tail, 0, dest, head.length, tail.length);
        return dest;
    }
}
