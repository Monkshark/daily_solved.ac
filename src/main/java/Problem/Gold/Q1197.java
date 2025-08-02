package Problem.Gold;

import java.util.*;
import java.io.*;

public class Q1197 {

    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        Node[] edges = new Node[E];
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(reader.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            edges[i] = new Node(from, to, cost);
        }

        Arrays.sort(edges, (n1, n2) -> n1.cost - n2.cost);
        parent = new int[V + 1];
        for (int i = 1; i <= V; i++) parent[i] = i;

        int total = 0;
        for (Node e : edges) {
            if (union(e.from, e.to)) total += e.cost;
        }

        System.out.println(total);
    }

    static int find(int x) {
        if (x == parent[x]) return x;
        return parent[x] = find(parent[x]);
    }

    static boolean union(int a, int b) {
        a = find(a); b = find(b);
        if (a == b) return false;
        parent[b] = a;
        return true;
    }

    static class Node {
        int from, to, cost;
        public Node(int f, int t, int c) {
            from = f; to = t; cost = c;
        }
    }
}