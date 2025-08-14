package Problem.Bronze;

import java.io.*;
import java.util.*;

public class Q9339 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(reader.readLine());

        while (T --> 0) {
            int K = Integer.parseInt(reader.readLine());
            List<Integer> student = new ArrayList<>();
            st = new StringTokenizer(reader.readLine());
            for (int i = 0; i < K; i++) student.add(Integer.parseInt(st.nextToken()));
            int N = Integer.parseInt(reader.readLine());
            PriorityQueue<Player> players = new PriorityQueue<>((p1, p2) -> p1.time - p2.time);

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(reader.readLine());
                int num = Integer.parseInt(st.nextToken());
                int h = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                if (h == -1 && m == -1) continue;
                players.offer(new Player(num, h * 60 + m));
            }

            int count = 0;
            int min = Integer.MAX_VALUE;
            while (!players.isEmpty()) {
                Player cur = players.poll();
                if (!student.contains(cur.number)) continue;
                if (min == Integer.MAX_VALUE) min = cur.number;

                if (cur.time <= 360) count++;
            }

            System.out.println(min + " " + count);
        }
    }

    static class Player {
        int number;
        int time;
        public Player(int n, int t) {
            number = n;
            time = t;
        }
    }
}
