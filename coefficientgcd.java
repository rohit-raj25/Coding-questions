public class coefficientgcd {
    public static void main(String[] args) {
        int a=30, b=20, x=1 ,y=1;
        int GCD[] = new int[3];
        gcd(a,b,x,y,GCD);
        for (int i:GCD)
            System.out.println(i+" ");
    }

    private static void gcd(int a,int b,int x,int y, int []GCD){
        if(a==0){
            x=0;
            y=1;
            GCD[0]=b;
            return;
        }

        int x1=1,y1=1;
        gcd(b%a,a,x1,y1, GCD);
        GCD[1]=x=y1-(b/a)*x1;
        GCD[2]=y=x1;
        return;
    }
}
