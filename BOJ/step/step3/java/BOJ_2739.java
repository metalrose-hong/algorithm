import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BOJ_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=9; i++) {
            System.out.printf("%d * %d = %d\n", n, i, (n*i));
        }

        br.close();
    }
}

// https://www.acmicpc.net/problem/2739
