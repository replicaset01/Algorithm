package DaliyCoding;

/**
 * 2차원 N x N 배열을 시계 방향으로 90도 회전시킨 배열을 리턴해야 합니다.
 */
public class Daily_34 {
    public int[][] rotateMatrix(int[][] matrix, int K) {
        //빈 배열일 경우
        if(matrix == null || matrix.length == 0) return matrix;

        int N = matrix.length;
        int M = matrix[0].length;

        int rotateNum = K % 4;
        // 회전하지 않는다.
        if(rotateNum == 0) return matrix;
        // 홀수번 회전 시 M x N, 짝수번 회전 시 N x M
        int[][] rotated = rotateNum % 2 == 1 ? new int[M][N] : new int[N][M];

        for(int row = 0; row < rotated.length; row++) {
            for(int col = 0; col < rotated[row].length; col++) {
                if(rotateNum == 1) {
                    rotated[row][col] = matrix[N - col - 1][row];
                } else if(rotateNum == 2) {
                    rotated[row][col] = matrix[N - row - 1][M - col - 1];
                } else {
                    rotated[row][col] = matrix[col][M - row - 1];
                }
            }
        }
        return rotated;
    }
}
