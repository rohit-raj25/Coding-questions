import java.util.Scanner;
import java.util.TreeSet;

class AllAboutPalindromes {
    private String s;

    AllAboutPalindromes() {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
    }

    void palindromeSubStrs() {
        TreeSet<String> set = new TreeSet<>();
        s = "@" + s + "#";
        int n = s.length();
        int[] R = new int[n];
        int rp = 0, palindromes = 0;

        for (int i = 1; i <= n; i++) {
            if (i < rp)
                R[i] = Math.min(R[2 * palindromes - i], rp - i);

            while (s.charAt(i + R[i] + 1) == s.charAt(i - R[i] - 1))
                R[i]++;

            if (i + R[i] > rp) {
                rp = i + R[i];
                palindromes = i;
            }

            set.add(s.substring(i - R[i], i + R[i] + 1).replaceAll("#", ""));
        }

        System.out.println(set.size());
    }
}

public class q9 {
    public static void main(String[] args) {
        AllAboutPalindromes AAP = new AllAboutPalindromes();
        AAP.palindromeSubStrs();
    }
}
