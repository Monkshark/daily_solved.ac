package Problem.Bronze;

import java.io.*;
import java.util.*;

public class Q17263 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        StringTokenizer st = new StringTokenizer(reader.readLine());

        for (int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(st.nextToken()));
        }

        System.out.println(pq.poll());
    }
}
