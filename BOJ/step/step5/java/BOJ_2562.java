import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BOJ_2562 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;
        int idx = -1;

        for(int i=0; i<9; i++){
            int num = Integer.parseInt(br.readLine());

            if(num > max) {
                max = num;
                idx = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(idx);

        br.close();
    }
}

// https://www.acmicpc.net/problem/2562
