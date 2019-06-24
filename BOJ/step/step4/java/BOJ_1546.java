import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ_1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalNumber = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int score = 0;
        double sum = 0;
        double ave = 0;
        int highScore = 0;

        for(int i=0; i<totalNumber; i++) {
            score = Integer.parseInt(st.nextToken());
            sum += score;

            highScore = (score > highScore) ? score : highScore;
        }

        ave = (100 * sum) / (totalNumber * highScore);

        System.out.printf("%.2f", ave);
		br.close();
	}
}

// https://www.acmicpc.net/problem/1546
