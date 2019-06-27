import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BOJ_10870 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputVal = Integer.parseInt(br.readLine());

        System.out.println(fibo(inputVal));
        br.close();
    }

    public static int fibo(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}

// https://www.acmicpc.net/problem/10870
