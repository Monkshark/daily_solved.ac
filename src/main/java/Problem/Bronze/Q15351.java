package Problem.Bronze;

import java.io.*;
import java.util.*;

public class Q15351 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            String input = reader.readLine();
            int score = 0;
            for (char c: input.toCharArray()) {
                if (c == ' ') continue;
                score += c - 'A' + 1;
            }

            System.out.println(
                    score == 100 ?
                            "PERFECT LIFE" :
                            score
            );
        }
    }
}
