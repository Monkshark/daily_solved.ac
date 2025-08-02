package Problem.Gold;

import java.io.*;
import java.util.*;

public class Q1766 {

    static int[] indegree;
    static List<Integer>[] graph;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) graph[i] = new ArrayList<>();

        indegree = new int[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(reader.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            graph[from].add(to);
            indegree[to]++;
        }

        for (int i: tSort()) {
            writer.write(i + " ");
        }
        writer.flush();
    }

    static List<Integer> tSort() {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 1; i <= N; i++) if (indegree[i] == 0) q.offer(i);
        List<Integer> result = new ArrayList<>();

        while (!q.isEmpty()) {
            int cur = q.poll();
            result.add(cur);

            for (int i: graph[cur]) {
                if (--indegree[i] == 0) q.offer(i);
            }
        }

        return result;
    }
}