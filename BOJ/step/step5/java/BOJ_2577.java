import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BOJ_2577 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int[] answerArr = new int[10];

        int val = Integer.parseInt(br.readLine()) *
                    Integer.parseInt(br.readLine()) *
                    Integer.parseInt(br.readLine());

        String valStr = String.valueOf(val);

        for(int i=0; i<valStr.length(); i++) {
            int num = Integer.parseInt(String.valueOf(valStr.charAt(i)));
            answerArr[num]++;
        }

        for(int i=0; i<10; i++) {
            sb.append(answerArr[i]).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}

// https://www.acmicpc.net/problem/2577
