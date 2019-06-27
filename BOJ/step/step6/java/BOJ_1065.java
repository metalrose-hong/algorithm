import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BOJ_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        int num = Integer.parseInt(br.readLine());

        for(int i=1; i<=num; i++) {
            if(hanNumber(i)) {
                answer++;
            }
        }

        System.out.println(answer);
        br.close();
    }

    public static boolean hanNumber(int n) {
        int diff = (n % 10) - ((n / 10) % 10);
        int tmpNum = n % 10;
        n = n / 10;

        while(n != 0) {
            if(tmpNum - (n % 10) != diff) {
                return false;
            }

            tmpNum = n % 10;
            n = n / 10;
        }

        return true;
    }
}

// https://www.acmicpc.net/problem/1065
