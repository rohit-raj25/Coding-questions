import java.util.*;

public class wrcSubstring {
    //without repeating character substring
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        longestS(s);
    }
    static void longestS(String str){
        int n=str.length();
        int res=0;
        int arr[]=new int[256];
        Arrays.fill(arr,-1);

        int i=0;
        for(int j=0;j<n;j++){
            i=Math.max(i,arr[str.charAt(j)]+1);
            res=Math.max(res,j-i+1);
            arr[str.charAt(j)]=j;

        }

        System.out.println(res);
    }
}
