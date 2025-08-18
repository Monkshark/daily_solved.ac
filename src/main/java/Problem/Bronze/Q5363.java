package Problem.Bronze;

import java.io.*;
import java.util.*;

public class Q5363 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        while (N --> 0) {
            String[] input = reader.readLine().split(" ");
            int len = input.length;

            for (int i = 2; i < len; i++) System.out.print(input[i] + " ");
            System.out.println(input[0] + " " + input[1]);
        }
    }
}
