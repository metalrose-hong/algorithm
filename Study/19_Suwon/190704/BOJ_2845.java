import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ_2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        StringTokenizer infoStr = new StringTokenizer(br.readLine());
        int answer = Integer.parseInt(infoStr.nextToken()) * Integer.parseInt(infoStr.nextToken());

        StringTokenizer paperStr = new StringTokenizer(br.readLine());

        while(paperStr.hasMoreTokens()) {
            int error = Integer.parseInt(paperStr.nextToken()) - answer;
            sb.append(error).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}

// https://www.acmicpc.net/problem/2845
