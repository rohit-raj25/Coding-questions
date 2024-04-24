import java.util.*;

public class rearrangePlayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        rearrange(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void rearrange(int[] arr, int n) {

        int temp[]=arr.clone();
        int i=0,j=n-1; 
        boolean flag=true;

        for(int a=0;a<n;a++){
            if(flag)
                arr[a]=temp[j--];

            else
                arr[a]=temp[i++];
            flag=!flag;
        }
    }
}
