import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BOJ_10872 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputVal = Integer.parseInt(br.readLine());

        System.out.println(factorial(inputVal));
        br.close();
    }

    public static int factorial(int n) {
        if(n < 2) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}

// https://www.acmicpc.net/problem/10872
