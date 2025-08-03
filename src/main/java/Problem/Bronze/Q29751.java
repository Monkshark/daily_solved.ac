package Problem.Bronze;

import java.util.*;
import java.io.*;

public class Q29751 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double result = Math.round(a * b / 2 * 10) / 10.0;
        System.out.println(result);
    }
}
