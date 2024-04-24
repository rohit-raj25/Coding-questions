import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String a="";
        Set<Character> set1=new HashSet<>();
        for(char c:s1.toCharArray()){
            set1.add(c);

        }
        Set<Character> set2=new HashSet<>();
        for(char c:s2.toCharArray()){
            set2.add(c);
            
        }

        for(char c:set1){
            if(set2.contains(c)){
                a+=c;
            }
        }


        System.out.println(a);

    }
}
