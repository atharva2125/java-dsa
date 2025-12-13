import java.util.Scanner;

class ZeroCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int L = scanner.nextInt();  // Length of binary string
        int K = scanner.nextInt();  // Number of ones
        
        // To minimize the longest consecutive zeros, we distribute K ones evenly
        // They divide the string into (K+1) segments
        // We have (L-K) zeros to distribute among (K+1) segments
        // The maximum consecutive zeros = ceil((L-K) / (K+1)) = L / (K+1) using integer division
        
        int maxConsecutiveZeros = L / (K + 1);
        
        System.out.println(maxConsecutiveZeros);
        
        scanner.close();
    }
}
