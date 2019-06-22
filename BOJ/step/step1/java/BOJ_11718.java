import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BOJ_11718 {
    public static void main(String args[]) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String readText;

        while((readText = br.readLine()) != null) {
            System.out.println(readText);
        }

        br.close();
        isr.close();
    }
}

// https://www.acmicpc.net/problem/11718
