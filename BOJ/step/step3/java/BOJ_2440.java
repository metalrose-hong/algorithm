import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BOJ_2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i=n; i>=1; i--) {
            for(int j=i; j>=1; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
        br.close();
    }
}

// https://www.acmicpc.net/problem/2440
