import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BOJ_3474 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcaseNum = Integer.parseInt(br.readLine());

        for(int i=0; i<testcaseNum; i++) {
            int num = Integer.parseInt(br.readLine());
            sb.append(countZero(num)).append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    public static int countZero(int num) {
        int zeroCount = 0;

        for(int i=5; i<=num; i=i*5) {
            zeroCount += num/i;
        }

        return zeroCount;
    }
}

// https://www.acmicpc.net/problem/3474
