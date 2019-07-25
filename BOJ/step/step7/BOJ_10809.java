import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BOJ_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String str = br.readLine();

        for(char i='a'; i<='z'; i++) {
            int index = str.indexOf(i);
            sb.append(index).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}

// https://www.acmicpc.net/problem/10809
