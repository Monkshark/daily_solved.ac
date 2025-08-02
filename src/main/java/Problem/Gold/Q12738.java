package Problem.Gold;

import java.util.*;
import java.io.*;

public class Q12738 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        long[] A = new long[N];
        StringTokenizer st = new StringTokenizer(reader.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }

        long[] tails = new long[N + 1];
        int len = 0;

        for (long num: A) {
            int idx = Arrays.binarySearch(tails, 0, len, num);

            if (idx < 0) idx = -idx - 1;
            if (idx == len) len++;

            tails[idx] = num;
        }

        System.out.println(len);
    }
}