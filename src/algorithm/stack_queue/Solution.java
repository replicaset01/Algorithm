package algorithm.stack_queue;

public class Solution {
    public static void main(String[] args) {
        int[] boxes = new int[]{5, 1, 4, 6};
        int output = paveBox(boxes);
        System.out.println(output); // 3

        int[] boxes2 = new int[]{1, 5, 7, 9};
        int output2 = paveBox(boxes);
        System.out.println(output2); // 1
    }

    public static int paveBox(int[] boxes) {
        // TODO:
        int count = 1;
        int first = boxes[0];
        for (int i = 1; i < boxes.length; i++) {
            if (first <= boxes[i]) { // 첫번째 요소 값이 뒤에 값들 보다 작거나 같을때
                first = boxes[i];
            } else {
                count++;
            }
        }
        return count;
    }
}
