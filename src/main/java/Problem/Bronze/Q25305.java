package Problem.Bronze;

import java.io.*;
import java.util.*;

public class Q25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        st = new StringTokenizer(reader.readLine());

        for (int i = 0; i < N; i++) pq.offer(Integer.parseInt(st.nextToken()));
        for (int i = 1; i < K; i++) pq.poll();

        System.out.println(pq.poll());
    }
}
