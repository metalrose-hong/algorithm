import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int testcaseCount = Integer.parseInt(br.readLine());

        for(int i=0; i<testcaseCount; i++) {
            String answer = br.readLine();
            int score = 0;
            int tempScore = 1;

            for(int j=0; j<answer.length(); j++) {
                if(answer.charAt(j) == 'O') {
                    score += tempScore;
                    tempScore++;
                } else {
                    tempScore = 1;
                }
            }

            sb.append(score).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}

// https://www.acmicpc.net/problem/8958
