package Problem.Bronze;

import java.util.*;
import java.io.*;

public class Q1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        List<String> plus = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        if (input.contains("-")) {
            plus = new ArrayList<>(List.of(input.split("-")));
        } else {
            plus.add(input);
        }

        for (String s: plus) {
            if (!s.contains("+")) {
                sum.add(Integer.parseInt(s));
                continue;
            }
            String[] minus = s.split("\\+");
            int temp = 0;
            for (String ss: minus) {
                temp += Integer.parseInt(ss);
            }
            sum.add(temp);
        }

        int answer = sum.get(0);

        for (int i = 1; i < sum.size(); i++) {
            answer -= sum.get(i);
        }
        System.out.println(answer);
    }
}
