import java.util.Scanner;

public class q2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String test = sc.nextLine();
        String demo = sc.nextLine();

        int result = test.toLowerCase().indexOf(demo.toLowerCase());

        System.out.print(result != -1 ? result : "Pattern not found");
    }
}
