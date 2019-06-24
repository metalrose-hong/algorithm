import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class BOJ_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number1 = Integer.parseInt(br.readLine());
        int number2 = Integer.parseInt(br.readLine());

        bw.write(Integer.toString(number1 * (number2 % 10)) + "\n");
        bw.write(Integer.toString(number1 * ((number2 % 100) / 10)) + "\n");
        bw.write(Integer.toString(number1 * (number2 / 100)) + "\n");
        bw.write(Integer.toString(number1 * number2));

        br.close();
        bw.flush();
        bw.close();
    }
}

// https://www.acmicpc.net/problem/2588
