package Problem.Bronze;

import java.io.*;
import java.util.*;
import java.math.*;

public class Q1271 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());
        System.out.println(A.divide(B));
        System.out.println(A.remainder(B));
    }
}
