import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BOJ_11721 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();

		for (int i = 0; i <= str.length(); i += 10) {
		    if(i + 10 <= str.length()) {
		        sb.append(str.substring(i, i+10)).append("\n");
		    } else {
		        sb.append(str.substring(i, str.length())).append("\n");
		    }
		}

		System.out.println(sb);
		br.close();
	}
}

// https://www.acmicpc.net/problem/11721
