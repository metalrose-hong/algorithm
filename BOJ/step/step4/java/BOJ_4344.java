import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ_4344 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcaseCount = Integer.parseInt(br.readLine());
        Testcase ts;

        for(int i=0; i<testcaseCount; i++) {
            ts = new Testcase(br.readLine());

            bw.write(String.format("%.3f", ts.clacAboveAvg()));
            bw.write("%\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

class Testcase {
    String[] testcase;
    int scoreCount;
    int[] score;
    int sum;
    float avg;

    public Testcase(String str) {
        StringTokenizer st = new StringTokenizer(str);
        scoreCount = Integer.parseInt(st.nextToken());
        score = new int[scoreCount];
        avg = 0;
        sum = 0;

        for(int i=0; i<scoreCount; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            sum += score[i];
        }

        avg = (float) sum / scoreCount;
    }

    public float clacAboveAvg() {
        int aboveAvgCount = 0;

        for(int i=0; i<scoreCount; i++) {
            if(score[i] > avg) {
                aboveAvgCount++;
            }
        }

        return (float) aboveAvgCount / scoreCount * 100;
    }
}

// https://www.acmicpc.net/problem/4344
