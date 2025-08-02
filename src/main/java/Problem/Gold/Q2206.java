package Problem.Gold;

import java.util.*;
import java.io.*;

public class Q2206 {

    static final int EMPTY = 0;
    static final int WALL = 1;

    static final int[] dx = {1, -1, 0, 0};
    static final int[] dy = {0, 0, 1, -1};

    static int[][] graph;
    static boolean[][][] visited;

    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int[N][M];
        visited = new boolean[N][M][2];

        for (int i = 0; i < N; i++) {
            String row = reader.readLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = row.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0, 0));
    }

    static int bfs(int x, int y) {
        Queue<Node> q = new ArrayDeque<>();
        q.offer(new Node(x, y, 1, 0));
        visited[x][y][0] = true;

        while (!q.isEmpty()) {
            Node cur = q.poll();

            if (cur.x == N - 1 && cur.y == M - 1) return cur.dist;

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

                if (graph[nx][ny] == EMPTY && !visited[nx][ny][cur.broken]) {
                    visited[nx][ny][cur.broken] = true;
                    q.offer(new Node(nx, ny, cur.dist + 1, cur.broken));
                }

                if (graph[nx][ny] == WALL && cur.broken == 0 && !visited[nx][ny][1]) {
                    visited[nx][ny][1] = true;
                    q.offer(new Node(nx, ny, cur.dist + 1, 1));
                }
            }
        }
        return -1;
    }

    static class Node {
        int x, y, dist, broken;
        Node(int x, int y, int dist, int broken) {
            this.x = x; this.y = y;
            this.dist = dist; this.broken = broken;
        }
    }
}
