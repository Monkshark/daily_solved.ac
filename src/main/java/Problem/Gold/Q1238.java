package Problem.Gold;

import java.util.*;
import java.io.*;

public class Q1238 {

    static final int INF = Integer.MAX_VALUE;

    static int N, M, X;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        List<Node>[] go = new ArrayList[N + 1];
        List<Node>[] back = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            go[i] = new ArrayList<>();
            back[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(reader.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            go[from].add(new Node(to, cost));
            back[to].add(new Node(from, cost));
        }

        int[] goResult = dijkstra(X, go);
        int[] backResult = dijkstra(X, back);

        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= N; i++) max = Math.max(goResult[i] + backResult[i], max);

        System.out.println(max);
    }


    static int[] dijkstra(int start, List<Node>[] graph) {
        int[] cost = new int[N + 1];
        boolean[] visited = new boolean[N + 1];
        Arrays.fill(cost, INF);
        Queue<Node> pq = new PriorityQueue<>((n1, n2) -> n1.cost - n2.cost);
        pq.offer(new Node(start, 0));
        cost[start] = 0;

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            if (visited[cur.to]) continue;
            visited[cur.to] = true;

            for (Node next: graph[cur.to]) {
                if (cost[next.to] > cost[cur.to] + next.cost) {
                    cost[next.to] = cost[cur.to] + next.cost;
                    pq.offer(new Node(next.to, cost[next.to]));
                }
            }
        }

        return cost;
    }

    static class Node {
        int to, cost;
        public Node(int t, int c) {
            to = t; cost = c;
        }
    }
}