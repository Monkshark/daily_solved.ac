package Problem.Bronze;

import java.io.*;
import java.util.*;

public class Q2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) arr[i] = Integer.parseInt(reader.readLine());
        Arrays.sort(arr);
        System.out.println((int) Arrays.stream(arr).average().getAsDouble());
        System.out.println(arr[2]);
    }
}
