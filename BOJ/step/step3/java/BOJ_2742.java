import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BOJ_2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while(n > 0) {
            sb.append(n).append("\n");
            n--;
        }

        System.out.println(sb.toString());
        br.close();
    }
}

// https://www.acmicpc.net/problem/2742
