import java.util.ArrayList;
import java.util.List;

public class ok1 {
    public static int findKthPrimeFactor(int number, int k) {
        List<Integer> primeFactors = new ArrayList<>();
        
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }
        
        if (k <= primeFactors.size()) {
            return primeFactors.get(k - 1);
        } else {
            return -1; // If k is greater than the number of prime factors, return -1
        }
    }
    
    public static void main(String[] args) {
        int number = 15;
        int k = 3;
        
        int kthPrimeFactor = findKthPrimeFactor(number, k);
        System.out.println("The " + k + "th prime factor of " + number + " is: " + kthPrimeFactor);
    }
}
