import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class BOJ_1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int exampleArrNum = Integer.parseInt(br.readLine());
        int[] exampleArr = new int[exampleArrNum];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<exampleArrNum; i++) {
            exampleArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(exampleArr);

        int findArrNum = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<findArrNum; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(checkExistNum(exampleArr, num)).append("\n");
        }

        System.out.println(sb);
        br.close();
	}

    public static int checkExistNum(int[] arr, int key) {
        int pl = 0;
        int pr = arr.length - 1;

        do {
            int pc = (pl + pr) / 2;
            if(arr[pc] == key) {
                return 1;
            } else if(arr[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while(pl <= pr);

        return 0;
    }
}

// https://www.acmicpc.net/problem/1920
