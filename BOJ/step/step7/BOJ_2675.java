import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BOJ_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcaseCount = Integer.parseInt(br.readLine());
        for(int i=0; i<testcaseCount; i++) {
            String[] testcase = br.readLine().split(" ");
            repeatStr(Integer.parseInt(testcase[0]), testcase[1]);
        }

        br.close();
    }

    public static void repeatStr(int repeatNum, String str) {
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<str.length(); i++) {
            for(int j=0; j<repeatNum; j++) {
                sb.append(str.subSequence(i, i+1));
            }
        }
        System.out.println(sb);
    }
}

// https://www.acmicpc.net/problem/2675
