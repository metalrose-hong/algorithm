import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabatCount = new int[26];

        String str = br.readLine();
        char[] chars = str.toCharArray();

        for(int i=0; i<chars.length; i++) {
            int alphabatNum = Character.toUpperCase(chars[i]) - 65;
            alphabatCount[alphabatNum]++;
        }

        boolean isDuplicate = false;
        int alphabatNum = -1;
        int max = -1;

        for(int i=0; i<26; i++) {
            if(alphabatCount[i] > max) {
                isDuplicate = false;
                alphabatNum = i+65;
                max = alphabatCount[i];
            } else if(alphabatCount[i] == max) {
                isDuplicate = true;
            }
        }

        if(isDuplicate) {
            System.out.println("?");
        } else {
            System.out.println(Character.toString((char)alphabatNum));
        }

        br.close();
    }
}

// https://www.acmicpc.net/problem/1157
