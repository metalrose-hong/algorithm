import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BOJ_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char inputChar = br.readLine().charAt(0);

        System.out.println((int)inputChar);

        br.close();
    }
}

// https://www.acmicpc.net/problem/11654
