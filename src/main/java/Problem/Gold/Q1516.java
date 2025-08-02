package Problem.Gold;

import java.util.*;
import java.io.*;

public class Q1516 {

    static List<Integer>[] graph;
    static int[] indegree, dp, time;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(reader.readLine());
        graph = new ArrayList[N + 1];
        indegree = new int[N + 1];
        dp = new int[N + 1];
        time = new int[N + 1];

        for (int i = 0; i <= N; i++) graph[i] = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            for (int j = Integer.parseInt(st.nextToken()); j != -1; j = Integer.parseInt(st.nextToken())) {
                graph[j].add(i);
                indegree[i]++;
            }
        }

        topoSort();

        for (int i = 1; i <= N; i++) {
            System.out.println(dp[i] + time[i]);
        }

    }

    static void topoSort() {
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) if (indegree[i] == 0) {
            q.offer(i);
            dp[i] = 0;
        }

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int next: graph[cur]) {
                dp[next] = Math.max(dp[cur] + time[cur], dp[next]);
                if (--indegree[next] == 0) q.offer(next);
            }
        }
    }
}