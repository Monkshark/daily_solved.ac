package Problem.Platinum;

import java.io.*;
import java.util.*;

public class Q16496 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        StringTokenizer st = new StringTokenizer(reader.readLine());
        List<String> input = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            input.add(st.nextToken());
        }

        input.sort((s1, s2) -> (s1 + s2).compareTo(s2 + s1));
        Collections.reverse(input);

        if (input.get(0).equals("0")) {
            System.out.print(0);
            return;
        }
        for (String s: input) System.out.print(s);
    }
}