import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Bits {
    // Function to count set bits in a number
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Create ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add numbers from 1 to n to the ArrayList
        for(int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        // Sort numbers based on their bit count
        Collections.sort(numbers, (a, b) -> {
            int bitsA = countSetBits(a);
            int bitsB = countSetBits(b);
            return bitsA - bitsB;
        });
        
        // Print the sorted numbers
        for(int num : numbers) {
            System.out.print(num);
        }
        
        sc.close();
    }
}