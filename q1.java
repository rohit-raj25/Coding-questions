import java.util.*;

public class q1 {
    static int f(int n,int w, int arr[],int weight[]){
        int dp[][]=new int[n+1][w+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                if(arr[i-1]<=j){
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-arr[i-1]]+weight[i-1]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][w];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();

        int arr[]=new int[n];
        int weight[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        for(int i=0;i<n;i++){
            weight[i]=sc.nextInt();
        }


        System.out.print(f(n,w,arr,weight));
    }
}
