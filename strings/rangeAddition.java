package strings;

import java.util.Scanner;

public class rangeAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int nq = sc.nextInt();

        int[][] queries = new int[nq][3];

        for (int q = 0; q < nq; q++) {
            queries[q][0] = sc.nextInt();
            queries[q][1] = sc.nextInt();
            queries[q][2] = sc.nextInt();
        }

        int[] res = get(length, queries);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] get(int length, int qi[][]) {
        int res[] = new int[length];

        for (int i = 0; i < qi.length; i++) {
            int st = qi[i][0];
            int end = qi[i][1];
            int inc = qi[i][2];

            res[st] += inc;
            if (end+1 < length) {
                res[end+1] -= inc;
            }

        }
        int sum = 0;

        for (int j = 0; j < length; j++) {
            sum += res[j];
            res[j] = sum;
        }
        return res;
    }
}
