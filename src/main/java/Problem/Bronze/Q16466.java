package Problem.Bronze;

import java.io.*;
import java.util.*;

public class Q16466 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] tickets = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            tickets[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(tickets);

        int expected = 1;
        for (int x : tickets) {
            if (x < expected) continue;
            if (x == expected) expected++;
            else break;
        }

        System.out.println(expected);
    }
}
