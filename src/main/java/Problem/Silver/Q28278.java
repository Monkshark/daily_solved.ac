package Problem.Silver;

import java.util.*;
import java.io.*;

public class Q28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        Deque<Integer> s = new ArrayDeque<>();

        while (N --> 0) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int cmd = Integer.parseInt(st.nextToken());

            switch (cmd) {
                case 1:
                    s.push(Integer.parseInt(st.nextToken()));
                    break;

                case 2:
                    writer.write(!s.isEmpty() ? String.valueOf(s.pop()) : "-1");
                    writer.newLine();
                    break;

                case 3:
                    writer.write(String.valueOf(s.size()));
                    writer.newLine();
                    break;

                case 4:
                    writer.write(s.isEmpty() ? "1" : "0");
                    writer.newLine();
                    break;

                case 5:
                    writer.write(!s.isEmpty() ? String.valueOf(s.peekFirst()) : "-1");
                    writer.newLine();
            }
        }
        writer.flush();
    }
}
