public class Q4 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println("min3(2,4,3,1) = " + min4(2, 4, 3, 1));
    }
}
