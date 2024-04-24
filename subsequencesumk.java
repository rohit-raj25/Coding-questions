

import java.util.*;

public class subsequencesumk {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int n = 3;
        int sum = 2;
        ArrayList<Integer> a = new ArrayList<>();
        printS(0, a, 0, sum, arr, n);
    }

    static void printS(int ind, ArrayList<Integer> a, int s, int sum, int[] arr, int n) {
        if (ind >= n) {
            if (s == sum) {
                for (int i : a) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            return;
        }

        a.add(arr[ind]);
        s += arr[ind];
        printS(ind + 1, a, s, sum, arr, n);
        s -= arr[ind];
        a.remove(a.size() - 1);
        printS(ind + 1, a, s, sum, arr, n);
    }
}
