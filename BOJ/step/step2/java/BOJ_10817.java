import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ_10817 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());

        int mid;

        if(x >= y) {
            if(x >= z) {
                if(y >= z) {
                    sb.append(y);
                } else {
                    sb.append(z);
                }
            } else {
                sb.append(x);
            }
        } else {
            if(y >= z) {
                if(x >= z) {
                    sb.append(x);
                } else {
                    sb.append(z);
                }
            } else {
                sb.append(y);
            }
        }

        System.out.println(sb.toString());
		br.close();
	}
}

// https://www.acmicpc.net/problem/10817
