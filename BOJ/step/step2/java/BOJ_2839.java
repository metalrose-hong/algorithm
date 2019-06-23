import java.util.Scanner;

public class BOJ_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSurgar = sc.nextInt();
        int threeCount, fiveCount;
        int totalCount = -1;

        for(threeCount = 0; threeCount * 3 <= totalSurgar ; threeCount++) {
            if((totalSurgar - (threeCount * 3)) % 5 == 0) {
                fiveCount = (totalSurgar - (threeCount * 3)) / 5;
                totalCount = threeCount + fiveCount;
                break;
            }
        }

        System.out.println(totalCount);
    }
}

// https://www.acmicpc.net/problem/2839
