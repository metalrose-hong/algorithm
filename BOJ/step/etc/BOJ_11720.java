import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BOJ_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String numbers = br.readLine();

        int sum = 0;

        for(int i = 1; i <= count; i++) {
            sum += numbers.charAt(i-1) - '0';
        }

        System.out.println(sum);
        br.close();
    }
}

// https://www.acmicpc.net/problem/11720
