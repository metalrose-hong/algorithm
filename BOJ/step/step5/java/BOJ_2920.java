import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BOJ_2920 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String strNotes = br.readLine();
        String[] notes = strNotes.split(" ");

        boolean ascending = false;
        boolean descending = false;

        for(int i=0; i<notes.length-1; i++) {
            if(Integer.parseInt(notes[i]) < Integer.parseInt(notes[i+1])) {
                ascending = true;
            } else {
                descending = true;
            }
        }

        if(ascending && !descending) {
            sb.append("ascending");
        } else if(!ascending && descending) {
            sb.append("descending");
        } else {
            sb.append("mixed");
        }

        System.out.println(sb);

        br.close();
    }
}

// https://www.acmicpc.net/problem/2920
