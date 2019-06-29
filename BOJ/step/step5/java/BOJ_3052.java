import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class BOJ_3052 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<Integer>();
        String str;

        while((str = br.readLine()) != null) {
            int modValue = Integer.parseInt(str) % 42;
            set.add(modValue);
        }

        System.out.println(set.size());
    }
}

// https://www.acmicpc.net/problem/3052
