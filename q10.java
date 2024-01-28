import java.util.Scanner;
//decipher the alphabatic code
public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Space-separated words
        System.out.println("Enter space-separated words:");
        String input = scanner.nextLine();

        // Output: Code number
        String code = decipherCode(input);
        System.out.println("Code number: " + code);
    }

    // Function to decipher the alphabetic code
    private static String decipherCode(String input) {
        

        StringBuilder code=new StringBuilder();

        String []words=input.split("\\s+");


        for(String word:words){
            int value=0;

            for(char ch:word.toCharArray()){
                if(Character.isUpperCase(ch)){
                    value+=(int)ch-'A'+1;

                }
                else{
                    value-=(int)ch-'a'+1;                
                }
            }

            value=Math.max(0,Math.min(value,9));
            code.append(value);
        }
        return code.toString();
    }
}
