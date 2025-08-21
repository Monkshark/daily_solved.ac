package Problem.Silver;

import java.io.*;
import java.util.*;

public class Q26596 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        HashMap<String, Integer> s = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            String name = st.nextToken();
            s.put(name, s.getOrDefault(name, 0) + Integer.parseInt(st.nextToken()));
        }

        List<Integer> list = new ArrayList<>(s.values());

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == Math.floor(list.get(j) * 1.618) || list.get(j) == Math.floor(list.get(i) * 1.618)) {
                    System.out.println("Delicious!");
                    return;
                }
            }
        }

        System.out.println("Not Delicious...");
    }
}
