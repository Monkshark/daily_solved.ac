package Problem.Gold;

import java.util.*;
import java.io.*;

public class Q1005 {
    static int N, K, W;
    static int[] time, dp, indegree;
    static List<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int T = Integer.parseInt(reader.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            time = new int[N + 1];
            dp = new int[N + 1];
            indegree = new int[N + 1];
            graph = new ArrayList[N + 1];
            for (int i = 1; i <= N; i++) graph[i] = new ArrayList<>();

            st = new StringTokenizer(reader.readLine());
            for (int i = 1; i <= N; i++) {
                time[i] = Integer.parseInt(st.nextToken());
                dp[i] = time[i];
            }

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(reader.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                graph[from].add(to);
                indegree[to]++;
            }

            W = Integer.parseInt(reader.readLine());

            System.out.println(tSort());
        }

    }

    static int tSort() {
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) q.offer(i);
        }

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int next : graph[cur]) {
                dp[next] = Math.max(dp[next], dp[cur] + time[next]);

                if (--indegree[next] == 0) q.offer(next);
            }
        }

        return dp[W];
    }
}
