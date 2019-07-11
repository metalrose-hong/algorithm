import java.util.Scanner;

public class Q3 {
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int i = 0;
        int idxCount = 0;

        a[n] = key;

        for (; i<=n; i++) {
            if (a[i] == key) {
                idx[idxCount++] = a[i];
            }
        }

        return i == n ? -1 : idxCount;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];
        int[] idx = new int[num];

        for(int i=0; i<num; i++){
            System.out.println("x[" + i + "] :");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = stdIn.nextInt();

        int idxCount = searchIdx(x, num, ky, new int[num]);

        if(idxCount == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(ky + "은(는) 모두 " + idxCount + "개 입니다.");
        }
    }
}
