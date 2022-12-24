package algorithm.factorial;

public class Factorial_Sum {

    public static void main(String[] args) {
        System.out.println("5 팩토리얼은" + factorial(5));
    }

    public static int factorial(int num) {
        if (num == 1)
            return 1;
        else
            return num * factorial(num - 1); // 5! = 5 * 4!
    }
}
