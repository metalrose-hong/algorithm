import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class BOJ_10171 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("\\    /\\\n");
        bw.write(" )  ( ')\n");
        bw.write("(  /  )\n");
        bw.write(" \\(__)|\n");

        bw.flush();
        bw.close();
    }
}

// https://www.acmicpc.net/problem/10171
