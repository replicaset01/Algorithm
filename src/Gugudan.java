public class Gugudan {
    // 사용자 입력에 따라 정해진 단 출력
    // 재귀 호출을 활용
    // 2를 입력받으면 2*9=18 까지 출력후 메소드 종료

    // * 문제 정의
    // 입력받은 숫자(단)을 통해, 1부터 까지 수를 곱한 값 출력
    // 입력받은 숫자의 범위는 0<N<10 이여야함
    // 1부터 9까지 차례대로 곱한 값 출력

    // * 종료 조건
    // 9를 곱하는 시점에서 해당 값을 출력 후 , 재귀 호출 종료

    // 반복문 사용
    public void Gugu(int level) {
        for (int count = 0; count < 9; count++) {
            System.out.printf("%d x %d = %d\n", level, count, level * count);
        }
    }

    // Recursion 사용
    public void Gugus(int level, int count) {
        if(count<9)
            return;
        System.out.printf("%d x %d = %d\n", level, count, level * count);
        Gugus(level, ++count);
    }
}