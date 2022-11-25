package DaliyCoding;

import java.util.PriorityQueue;

/* 정수를 요소로 갖는 배열을 입력받아 오름차순으로 정렬하여 리턴해야 합니다. */
public class Daily_39 {
    public int[] heapSort(int[] arr) {
        // 힙 정렬에 사용될 힙(우선순위 큐)을 선언합니다.
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        // 배열의 값을 힙에 모두 할당합니다.
        for(int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }

        // 힙에서 우선순위가 가장 높은 원소(root노드)를 하나씩 배열에 넣어줍니다.
        for(int i = 0; i < arr.length; i++) {
            arr[i] = heap.poll();
        }

        return arr;
    }
}
