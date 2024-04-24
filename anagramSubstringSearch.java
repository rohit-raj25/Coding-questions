
import java.util.*;
public class anagramSubstringSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        ps(s1,s2);
    }

    static void ps(String str,String pat){
        int n=str.length(),m=pat.length();

        Map<Character,Integer> strmap=new HashMap<>();
        Map<Character,Integer> patmap=new HashMap<>();

        for(int i=0;i<m;i++){
            patmap.put(pat.charAt(i),patmap.getOrDefault(pat.charAt(i),0));
        }

        for(int i=0;i<m;i++){
            patmap.put(pat.charAt(i),patmap.getOrDefault(pat.charAt(i),0));
        }


    }
}
