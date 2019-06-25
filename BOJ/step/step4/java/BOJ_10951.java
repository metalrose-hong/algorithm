import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ_10951 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;

        while((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            bw.write(Integer.toString(x+y) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

// https://www.acmicpc.net/problem/10951
