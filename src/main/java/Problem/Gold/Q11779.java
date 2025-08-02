package Problem.Gold;

import java.io.*;
import java.util.*;

public class Q11779 {

    static final int INF = Integer.MAX_VALUE;

    static int[] cost, prev;
    static List<Node>[] graph;
    static int N, M, depart, arrive;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(reader.readLine());
        M = Integer.parseInt(reader.readLine());
        graph = new ArrayList[N + 1];
        prev = new int[N + 1];
        for (int i = 1; i <= N; i++) graph[i] = new ArrayList<>();
        cost = new int[N + 1];
        Arrays.fill(cost, INF);

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph[from].add(new Node(to, cost));
        }

        StringTokenizer st = new StringTokenizer(reader.readLine());
        depart = Integer.parseInt(st.nextToken());
        arrive = Integer.parseInt(st.nextToken());

        dijkstra(depart);

        List<Integer> track = new ArrayList<>();
        int cur = arrive;
        while (cur != 0) {
            track.add(cur);
            cur = prev[cur];
        }
        Collections.reverse(track);

        System.out.println(cost[arrive]);
        System.out.println(track.size());
        for (int i: track) System.out.print(i + " ");
    }

    static void dijkstra(int start) {
        Queue<Node> pq = new PriorityQueue<>((n1, n2) -> n1.cost - n2.cost);
        boolean[] visited = new boolean[N + 1];
        pq.offer(new Node(start, 0));
        cost[start] = 0;

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            if (visited[cur.to]) continue;
            visited[cur.to] = true;

            for (Node next: graph[cur.to]) {
                if (cost[next.to] > cost[cur.to] + next.cost) {
                    cost[next.to] = cost[cur.to] + next.cost;
                    prev[next.to] = cur.to;
                    pq.offer(new Node(next.to, cost[next.to]));
                }
            }
        }
    }

    static class Node {
        int to, cost;
        public Node(int t, int c) {
            to = t; cost = c;
        }
    }
}