package Problem.Bronze;

import java.io.*;
import java.util.*;

public class Q28113 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        st.nextToken();
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (A == B) System.out.println("Anything");
        else System.out.println(A > B ? "Subway" : "Bus");
    }
}
