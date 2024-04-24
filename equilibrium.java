import java.util.*;

public class equilibrium{
    public static void main(String[] args) {
        // int arr[]={1,10,1,2,3,4,2};
        // int n=arr.length;

        // int i=0;
        // int j=arr.length-1;

        // int sum=0;
        // int sum2=0;

        // while(i<=j){
            
            
        //     if(sum<=sum2){
        //         sum+=arr[i];
        //         i++;
        //     }
        //     else{
        //         sum2+=arr[j];
        //         j--;
        //     }
        //     if(sum==sum2){ 
        //         System.out.println(i);
        //         return;
        //     }


        // }
        // System.out.println(-1);


        //2nd approach

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = scanner.nextInt();
        System.out.println(equilibrium(arr, n));

        
    }
    static int equilibrium(int arr[], int n) {
        int sum=0;
        int leftsum=0;

        for(int i=0;i<n;i++) sum+=arr[i];

        for(int i=0;i<n;i++){
            sum-=arr[i];
            if(leftsum==sum) return i;
            leftsum+=arr[i];
        }
        return -1;
    }
}