package DaliyCoding;
// spiralTraversal
/* 2차원 M x N 배열을 나선형(spiral)으로 순회해야 합니다. */
public class Daily_43 {
    public String spiralTraversal(Character[][] matrix) {
        // 각 방향마다 row와 col의 변화를 저장
        int[] RIGHT = new int[]{0, 1};
        int[] DOWN = new int[]{1, 0};
        int[] LEFT = new int[]{0, -1};
        int[] UP = new int[]{-1, 0};
        // 각 방향을 위한 lookup table
        int[][] MOVES = new int[][]{
                RIGHT, DOWN, LEFT, UP
        };

        int M = matrix.length;
        int N = matrix[0].length;

        int cnt = 0;
        int row = 0, col = -1;
        int direction = 0;
        StringBuilder result = new StringBuilder();
        while (cnt < M * N) {
            int[] move = MOVES[direction];
            int rd = move[0], cd = move[1];

            row = row + rd;
            col = col + cd;
            while (isValid(row, col, M, N) && matrix[row][col] != null) {
                result.append(matrix[row][col]);
                matrix[row][col] = null;
                row = row + rd;
                col = col + cd;
                cnt++;
            }
            // row, col 이 행렬의 범위를 벗어났기 때문에,
            // 진행된 방향의 반대로 한 칸 이동한다.
            row = row - rd;
            col = col - cd;

            // 각 방향이 순환되기 때문에 모듈러 연산을 사용한다.
            direction = (direction + 1) % 4;
        }
        return result.toString();
    }

    public boolean isValid(int row, int col, int M, int N) {
        return (row >= 0 && row < M && col >= 0 && col < N);
    }
}
