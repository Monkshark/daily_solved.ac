package Problem.Bronze;

import java.io.*;
import java.util.*;

public class Q2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine()) + 1;

        while (N --> 0) {
            for (int i = 0; i < N; i++) System.out.print("*");
            System.out.print("\n");
        }
    }
}
