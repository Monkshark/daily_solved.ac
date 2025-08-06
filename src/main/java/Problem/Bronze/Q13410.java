package Problem.Bronze;

import java.io.*;
import java.util.*;

public class Q13410 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 1; i <= K; i++) {
            pq.offer(
                    Integer.parseInt(
                            String.valueOf(
                                    new StringBuilder(String.valueOf(N * i)).reverse()
                            )
                    )
            );
        }

        System.out.println(pq.poll());
    }
}
