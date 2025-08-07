package Problem.Bronze;

import java.io.*;
import java.util.*;

public class Q2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int max = Integer.parseInt(input[0].replace("5", "6")) +
                Integer.parseInt(input[1].replace("5", "6"));

        int min = Integer.parseInt(input[0].replace("6", "5")) +
                Integer.parseInt(input[1].replace("6", "5"));

        System.out.println(min + " " + max);
    }
}
