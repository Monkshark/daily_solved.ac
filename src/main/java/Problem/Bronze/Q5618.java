package Problem.Bronze;

import java.util.*;
import java.io.*;

public class Q5618 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int A, B, C;

        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        if(n == 2) {
            for(int i = 1; i <= Math.min(A, B); i++) {
                if(A % i == 0 && B % i == 0) {
                    System.out.println(i);
                }
            }
        }else {
            C = Integer.parseInt(st.nextToken());
            for(int i = 1; i <= Math.min(A, Math.min(B, C)); i++) {
                if(A % i == 0 && B % i == 0 && C % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }

}