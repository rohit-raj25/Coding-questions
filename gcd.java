public class gcd {
    public static void main(String[] args) {
        System.out.println(gcd(15,10));
    }

    private static int gcd(int a ,int b){
        if(a==0){
            return b;
        }

        return gcd(b%a,a);
    }
}
