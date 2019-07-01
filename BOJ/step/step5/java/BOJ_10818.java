import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ_10818 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        br.close();

        int tmpNum = Integer.parseInt(st.nextToken());
        int min = tmpNum;
        int max = tmpNum;

        for(int i=1; i<num; i++) {
            tmpNum = Integer.parseInt(st.nextToken());

            if(tmpNum < min) {
                min = tmpNum;
            } else if(tmpNum > max) {
                max = tmpNum;
            }

        }

        System.out.println(min + " " + max);
    }
}

// https://www.acmicpc.net/problem/10818
