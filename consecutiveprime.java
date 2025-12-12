import java.util.*;

public class consecutiveprime {

    // Simple function to check prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
         
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 0,count = 0;

        // Add primes one by one starting from 2
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {       // check if i is prime
                sum += i;           // add it to the running sum

                // only consider sums of at least 2 primes, so sum > 2
                if (sum <= N && sum > 2 && isPrime(sum)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
