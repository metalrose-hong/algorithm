import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BOJ_10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] token;

        token = br.readLine().split(" ");
        int totalNumber = Integer.parseInt(token[0]);
        int targetNumber = Integer.parseInt(token[1]);

        token = br.readLine().split(" ");

        for(int i = 0; i < totalNumber; i++){
            if(Integer.parseInt(token[i]) < targetNumber) {
                sb.append(token[i]).append(" ");
            }
        }

        System.out.println(sb.toString());
		br.close();
	}
}

// https://www.acmicpc.net/problem/10871
