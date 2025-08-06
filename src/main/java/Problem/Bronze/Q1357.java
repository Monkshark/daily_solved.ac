package Problem.Bronze;

import java.io.*;
import java.util.*;

public class Q1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        System.out.println(rev(rev(x) + rev(y)));
    }

    static int rev(int n) {
        return Integer.parseInt(
                new StringBuilder(String.valueOf(n))
                        .reverse()
                        .toString()
        );
    }
}
