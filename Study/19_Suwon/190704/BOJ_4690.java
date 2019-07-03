public class BOJ_4690 {
        public static void main(String[] args) {
            for(int a=2; a<=100; a++) {
                for(int b=2; b<=99; b++) {
                    for(int c=b; c<=99; c++) {
                        int rest = a*a*a - b*b*b - c*c*c;
                        for(int d=c; d*d*d<=rest; d++) {
                            if(d*d*d == rest) {
                                printTriple(a, b, c, d);
                            }
                        }
                    }
                }
            }
        }

        static void printTriple(int a, int b, int c, int d) {
    		System.out.println("Cube = " + a + ", Triple = (" + b + "," + c + "," + d + ")");
    	}
    }
}

// https://www.acmicpc.net/problem/4690
