import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BOJ_11729 {
    public static StringBuffer sb = new StringBuffer();
    public static int count = 0;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();

        move(1, 3, num);

        System.out.println(count);
        System.out.println(sb);
    }

    public static void move(int dep, int arr, int num) {
        if(num == 0) {
            return;
        }

        move(dep, 6-arr-dep, num-1);
        sb.append(dep).append(" ").append(arr).append("\n");
        move(6-arr-dep, arr, num-1);
        count++;
    }
}


// https://www.acmicpc.net/problem/11729
