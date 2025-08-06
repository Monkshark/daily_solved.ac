package Problem.Bronze;

import java.io.*;
import java.util.*;

public class Q11109 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());

        while (T --> 0) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int d  = Integer.parseInt(st.nextToken());
            int n  = Integer.parseInt(st.nextToken());
            int s  = Integer.parseInt(st.nextToken());
            int p  = Integer.parseInt(st.nextToken());

            System.out.println(
                    d + p * n == s * n ?
                            "does not matter" :
                            d + p * n < s * n ?
                                    "parallelize" :
                                    "do not parallelize"
            );
        }
    }
}
