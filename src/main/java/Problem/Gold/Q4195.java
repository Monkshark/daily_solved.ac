package Problem.Gold;

import java.util.*;
import java.io.*;

public class Q4195 {

    static Map<String, String> parent;
    static Map<String, Integer> size;
    static int F;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());

        while (T-- > 0) {
            parent = new HashMap<>();
            size = new HashMap<>();
            F = Integer.parseInt(reader.readLine());
            for (int i = 0; i < F; i++) {
                StringTokenizer st = new StringTokenizer(reader.readLine());
                String a = st.nextToken();
                String b = st.nextToken();
                parent.putIfAbsent(a, a);
                parent.putIfAbsent(b, b);
                size.putIfAbsent(a, 1);
                size.putIfAbsent(b, 1);
                System.out.println(union(a, b));
            }
        }
    }

    static String find(String x) {
        if (parent.get(x).equals(x)) return x;
        String root = find(parent.get(x));
        parent.put(x, root);
        return root;
    }

    static int union(String a, String b) {
        a = find(a); b = find(b);
        if (a.equals(b)) return size.get(b);
        parent.put(a, b);
        size.put(b, size.get(a) + size.get(b));
        return size.get(b);
    }
}