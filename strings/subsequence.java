package strings;

public class subsequence {
    public static void main(String[] args) {
        String s1="geeksforgeeks";
        String s2="gages";

        int i=0;
        int j=0;
        int n=s1.length();
        int m=s2.length();
        while(i<n){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
            else i++;
        }

        if(i==n && j==m) System.out.println("true");
        else System.out.println("false");


    }
}
