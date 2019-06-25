import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class BOJ_2753 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());
        int isLeapYear = 0;

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            isLeapYear = 1;
        }

        bw.write(Integer.toString(isLeapYear));

        bw.flush();
        bw.close();
        br.close();
    }
}

// https://www.acmicpc.net/problem/2753
