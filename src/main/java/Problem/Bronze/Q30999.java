package Problem.Bronze;

import java.io.*;
import java.util.*;

public class Q30999 {

    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int result = 0;

        for (int i = 0; i < N; i++) {
            String input = reader.readLine();
            int agree = (M + 1) / 2;
            int count = 0;

            for (int j = 0; j < M; j++) {
                if (input.charAt(j) == 'O') count++;
            }
            if (agree <= count) result++;
        }

        System.out.println(result);
    }
}
