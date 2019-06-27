public class BOJ_4673 {
    public static void main(String[] args) {
        SelfNum sn = new SelfNum(10000);
    }
}

class SelfNum {
    boolean[] nonSelfNumArr;
    StringBuilder sb = new StringBuilder();

    SelfNum(int length) {
        nonSelfNumArr = new boolean[length+1];          // true: non-selfnum

        for(int i=1; i<nonSelfNumArr.length; i++) {
            if(!nonSelfNumArr[i]) {
                sb.append(i).append("\n");
            }

            int removeNum = this.calcNum(i);
            if(removeNum <= length) {
                nonSelfNumArr[removeNum] = true;
            }
        }

        System.out.println(sb);
    }

    public int calcNum(int n) {
        int sum = n;

        while(n != 0) {
            sum += (n % 10);
            n /= 10;
        }

        return sum;
    }
}

// https://www.acmicpc.net/problem/4673
