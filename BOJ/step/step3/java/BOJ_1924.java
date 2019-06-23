import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class BOJ_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        int inputMonth = Integer.parseInt(st.nextToken());
        int inputDay = Integer.parseInt(st.nextToken());

        int[] MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;

        for(int i = 1; i < inputMonth; i++) {
            days += MONTH[i-1];
        }

        days += inputDay;

        switch (days % 7) {
            case 0 :
                sb.append("SUN");
                break;
            case 1 :
                sb.append("MON");
                break;
            case 2 :
                sb.append("TUE");
                break;
            case 3 :
                sb.append("WED");
                break;
            case 4 :
                sb.append("THU");
                break;
            case 5 :
                sb.append("FRI");
                break;
            case 6 :
                sb.append("SAT");
                break;
        }

        System.out.println(sb.toString());
        br.close();
    }
}

// https://www.acmicpc.net/problem/1924
