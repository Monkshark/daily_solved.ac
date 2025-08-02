package Problem.Gold;

import java.io.*;
import java.util.*;

public class Q2252 {

    static int N, M;
    static List<Integer>[] graph;
    static int[] indegree;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) graph[i] = new ArrayList<>();
        indegree = new int[N + 1];

        for (int i = 0; i < M; i++) {
            st = new  StringTokenizer(reader.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            graph[from].add(to);
            indegree[to]++;
        }

        tSort();
    }

    static void tSort() {
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) q.offer(i);
        }

        while (!q.isEmpty()) {
            int cur = q.poll();
            System.out.println(cur + " ");

            for (int next: graph[cur]) {
                indegree[next]--;
                if (indegree[next] == 0) q.offer(next);
            }
        }
    }
}