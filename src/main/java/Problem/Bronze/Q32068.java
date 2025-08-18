package Problem.Bronze;

import java.io.*;
import java.util.*;

public class Q32068 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long L = Long.parseLong(st.nextToken());
            long R = Long.parseLong(st.nextToken());
            long S = Long.parseLong(st.nextToken());

            long leftDist = S - L;
            long rightDist = R - S;

            long ans = (leftDist < rightDist) ? (leftDist * 2 + 1) : (rightDist * 2);
            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}
