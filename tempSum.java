import java.util.Scanner;

public class tempSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int i = 0; // Adjusted loop starting index
        int j = k - 1; // Adjusted loop ending index
        int res = 0;

        while (j < n) { // Adjusted loop condition
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int a = i; a <= j; a++) {
                min = Math.min(arr[a], min);
                max = Math.max(arr[a], max);
            }
            res += (min + max);
            i++;
            j++;
        }
        System.out.println(res);
    }
}
