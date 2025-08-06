package Problem.Silver;

import java.util.*;
import java.io.*;

public class Q10384 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= T; i++) {
            String input = reader.readLine().toLowerCase().replaceAll("[^a-z]", "");
            int[] alphabets = new int[26];
            for (char c: input.toCharArray()) alphabets[c - 'a']++;
            int answer = Arrays.stream(alphabets).min().getAsInt();
            StringBuilder sb = new StringBuilder("Case " + i + ": ");
            switch (answer) {
                case 0:
                    sb.append("Not a pangram");
                    break;

                case 1:
                    sb.append("Pangram!");
                    break;

                case 2:
                    sb.append("Double pangram!!");
                    break;

                case 3:
                    sb.append("Triple pangram!!!");
                    break;
            }
            System.out.println(sb);
        }
    }
}
