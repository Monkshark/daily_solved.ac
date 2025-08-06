package Problem.Bronze;

import java.io.*;
import java.util.*;

public class Q10797 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String target = reader.readLine();
        String input = reader.readLine();

        System.out.println(
                input.length() - input.replaceAll(target, "").length()
        );
    }
}
