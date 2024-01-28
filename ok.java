    // Online Java Compiler
    // Use this editor to write, compile and run your Java code online
    import java.util.*;
    class ok {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                
            }
            int a=sc.nextInt();
            
            if(a==3){
                for(int i=n-3;i<n;i++){
                    for(int j=i+1;j<n;j++){
			if (arr[j] < arr[i]) 
 { 
 int temp = arr[i]; 
 arr[i] = arr[j]; 
 arr[j] = temp; 
 }
                    }
                }
            }

	    for (int i: arr){
            	System.out.print(i + " ");
	    }
        }
    }
