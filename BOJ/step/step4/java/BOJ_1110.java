import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class BOJ_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tens, units, sum, sumUnits;
        int answer = 0;
        int number = Integer.parseInt(br.readLine());
        int newNumber = number;

        do {
            tens = newNumber / 10;
            units = newNumber % 10;

            sum = tens + units;
            sumUnits = sum % 10;

            newNumber = units * 10 + sumUnits;
            answer++;
        } while(number != newNumber);

        bw.write(Integer.toString(answer));

        br.close();
        bw.flush();
        bw.close();
    }
}

// https://www.acmicpc.net/problem/1110
