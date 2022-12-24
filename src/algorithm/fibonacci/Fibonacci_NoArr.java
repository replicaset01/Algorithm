package algorithm.fibonacci;

public class Fibonacci_NoArr {
    public static void main(String[] args) {
        int prevPrevNum = 1; // n-2
        int prevNum = 1; // n-1

        for (int i=3; i<100; i++) {
            int curNum = prevPrevNum + prevNum;
            System.out.println(curNum + " ");

            prevPrevNum = prevNum;
            prevNum = curNum;
        }
    }
}
