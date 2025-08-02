package Problem.Gold;

import java.util.*;
import java.io.*;

public class Q4386 {

    static int[] parent;
    static int n;
    static double[][] stars;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Node> q = new PriorityQueue<>((n1, n2) -> Double.compare(n1.cost, n2.cost));

        n = Integer.parseInt(reader.readLine());
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
        stars = new double[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            double x = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());
            stars[i][0] = x;
            stars[i][1] = y;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double dx = stars[i][0] - stars[j][0];
                double dy = stars[i][1] - stars[j][1];
                double dist = Math.sqrt(dx * dx + dy * dy);
                q.offer(new Node(i, j, dist));
            }
        }

        double total = 0;

        while(!q.isEmpty()) {
            Node cur = q.poll();
            if (union(cur.from, cur.to)) total += cur.cost;
        }

        System.out.println(total);

    }

    static class Node {
        int from, to;
        double cost;

        public Node(int f, int t, double c) {
            from = f; to = t;
            cost = c;
        }
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

}