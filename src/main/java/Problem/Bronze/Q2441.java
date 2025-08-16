package Problem.Bronze;

import java.util.*;
import java.io.*;

public class Q2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(i <= j ? "*" : " ");
            }
            System.out.println();
        }
    }
}
