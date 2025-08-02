package Problem.Bronze;

import java.util.*;
import java.io.*;

public class Q27959 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        System.out.println(A * 100 >= B ? "Yes" : "No");
    }
}
