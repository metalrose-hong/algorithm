import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ_11021 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcaseCount = Integer.parseInt(br.readLine());

        for(int i=0; i<testcaseCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bw.write(String.format("Case #%d: %d\n", i+1, sum));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

// https://www.acmicpc.net/problem/11021
