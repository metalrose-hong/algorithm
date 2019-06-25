import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ_2884 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        if(min < 45) {
            hour--;
            min = min +15;
        } else {
            min -= 45;
        }

        if(hour == -1) {
            hour = 23;
        }

        System.out.println(Integer.toString(hour) + " " + Integer.toString(min));

        br.close();
    }
}

// https://www.acmicpc.net/problem/2884
