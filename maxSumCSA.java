import java.util.Scanner;

public class maxSumCSA {


    //input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = scanner.nextInt();
        int max=Integer.MIN_VALUE;
        int maxend=0;

        for(int i=0;i<n;i++){
            maxend=maxend+arr[i];
            if(max<maxend){
                max=maxend;
            }
            if(maxend<0){
                maxend=0;
            }
        }
        System.out.println(max);
    }
}
