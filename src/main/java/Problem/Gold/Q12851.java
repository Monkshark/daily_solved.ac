package Problem.Gold;

import java.util.*;
import java.io.*;

public class Q12851 {
    static int N, K;
    static int[] dist = new int[100001];
    static int[] count = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        Arrays.fill(dist, -1);
        bfs(N);

        System.out.println(dist[K]);
        System.out.println(count[K]);
    }

    static void bfs(int start) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(start);
        dist[start] = 0;
        count[start] = 1;

        while (!q.isEmpty()) {
            int cur = q.poll();

            int[] nextPositions = {cur - 1, cur + 1, cur * 2};
            for (int next : nextPositions) {
                if (next < 0 || next > 100000) continue;

                if (dist[next] == -1) {
                    dist[next] = dist[cur] + 1;
                    count[next] = count[cur];
                    q.offer(next);
                } else if (dist[next] == dist[cur] + 1) {
                    count[next] += count[cur];
                }
            }
        }
    }
}
