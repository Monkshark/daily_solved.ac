package Problem.Bronze;

import java.util.*;
import java.io.*;

public class Q32652 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine()) - 1;
        StringBuilder sb = new StringBuilder("AKARAKA");
        while (n --> 0) sb.append("RAKA");

        System.out.println(sb);
    }
}
