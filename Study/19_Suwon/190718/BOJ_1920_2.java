import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;

public class BOJ_1920_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int exampleArrNum = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<exampleArrNum; i++) {
            set.add(st.nextToken());
        }

        int findArrNum = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<findArrNum; i++) {
            if(set.contains(st.nextToken())) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }

        System.out.println(sb);
        br.close();
	}
}

// https://www.acmicpc.net/problem/1920
