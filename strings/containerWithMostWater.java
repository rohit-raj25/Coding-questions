package strings;

import java.util.*;

public class containerWithMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j = n - 1;
        int max = Integer.MIN_VALUE;

        while (i < j) {
            max = Math.max(max, Math.min(arr[i], arr[j]) * (j - i));
            if (arr[i] < arr[j]) {
                i++;
            } else {
                j--;
            }
        }

        System.out.print(max);
    }
}
