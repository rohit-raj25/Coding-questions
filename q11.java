import java.util.*;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int n = sc.nextInt();
        int coins[] = new int[n];

        int[][] dp = new int[n][target + 1];

        // Initialize the dp array with -1 to indicate that subproblems are not solved yet
        for (int row[] : dp)
            Arrays.fill(row, -1);
        
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        int result = f(n - 1, target, coins,dp);
        System.out.println(result != Integer.MAX_VALUE ? result : -1);
    }

    static int f(int ind, int t, int coins[],int dp[][]) {
        if(t==0) return 0;
        if(ind==0){
            if(t%coins[0]==0) return t/coins[0];
            return (int ) 1e9;

        }

        if(dp[ind][t]!=-1) return dp[ind][t];

        int notTake=f(ind-1, t, coins, dp);
        int take=(int) 1e9;
        if(coins[ind]<=t){
            take=f(ind, t-coins[ind], coins, dp);
            if(take!=(int)1e9){
                take=1+take;
            }
        }

        return dp[ind][t]=Math.min(take,notTake);
    }
}
