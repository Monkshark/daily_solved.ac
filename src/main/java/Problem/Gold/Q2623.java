package Problem.Gold;

import java.io.*;
import java.util.*;

public class Q2623 {

    static List<Integer>[] graph;
    static int[] indegree;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        indegree = new int[N + 1];
        for (int i = 1; i <= N; i++) graph[i] = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String[] singer = reader.readLine().split(" ");
            int pd = Integer.parseInt(singer[0]);
            for (int j = 1; j < pd; j++) {
                int from = Integer.parseInt(singer[j]);
                int to = Integer.parseInt(singer[j + 1]);
                graph[from].add(to);
                indegree[to]++;
            }
        }

        tSort();
    }

    static void tSort() {
        Queue<Integer> q = new ArrayDeque<>();
        int count = 0;
        for (int i = 1; i <= N; i++) if (indegree[i] == 0) q.offer(i);
        StringBuilder sb = new StringBuilder();

        while (!q.isEmpty()) {
            int cur = q.poll();
            sb.append(cur).append("\n");
            count++;

            for (int next: graph[cur]) {
                indegree[next]--;
                if (indegree[next] == 0) q.offer(next);
            }
        }

        if (count < N) {
            System.out.println(0);
        } else {
            System.out.println(sb.toString());
        }
    }
}