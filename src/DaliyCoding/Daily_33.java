package DaliyCoding;

/**
 * 세로와 가로의 길이가 각각 M, N인 방의 지도가 2차원 배열로 주어졌을 때,
 * 1은 장애물을 의미하고 0 이동이 가능한 통로를 의미합니다.
 * 로봇은 지도 위를 일분에 한 칸씩 상하좌우로 이동할 수 있습니다.
 * 로봇의 위치와 목표 지점이 함께 주어질 경우,
 * 로봇이 목표 지점까지 도달하는 데 걸리는 최소 시간을 리턴해야 합니다
 */
public class Daily_33 {
    public int robotPath(int[][] room, int[] src, int[] dst) {
        // 로봇이 서 있는 위치를 1로 초기화하면 (다시 방문하지 않기 위해서),
        // 바로 옆 통로는 2가 된다.
        // 계산이 완료된 후에 최종값에 1을 빼주면 된다.
        room = aux(room.length, room[0].length, src, 1, room);

        return room[dst[0]][dst[1]] - 1;
    }

    public int[][] aux(int M, int N, int[] candi, int step, int[][] room) {
        // 현재 위치
        int row = candi[0];
        int col = candi[1];

        // 배열의 범위를 벗어난 경우
        if (row < 0 || row >= M || col < 0 || col >= N) return room;

        if (room[row][col] == 0 || room[row][col] > step) {
            room[row][col] = step;
        } else {
            // 장애물(1)이거나 이미 최소 시간(1)으로 통과가 가능한 경우
            return room;
        }

        // dfs로 4가지 방향에 대해 탐색을 한다.
        // 완전탐색을 해야하므로 bfs나 dfs가 큰 차이가 없다.
        // bfs의 경우 목적지에 도착하는 경우 탐색을 중단해도 되므로,
        // 약간 더 효율적이다.
        aux(M, N, new int[]{row + 1, col}, step + 1, room); // 상
        aux(M, N, new int[]{row - 1, col}, step + 1, room); // 하
        aux(M, N, new int[]{row, col - 1}, step + 1, room); // 좌
        aux(M, N, new int[]{row, col + 1}, step + 1, room); // 우

        return room;
    }
}
