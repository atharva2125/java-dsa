import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

class MaxSubarraySumNoDuplicates {
    
    // Step 1: Modify array - decrement even numbers by 1
    public static int[] modifyArray(int[] arr) {
        int[] modifiedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                modifiedArr[i] = arr[i] - 1;  // Decrement even numbers by 1
            } else {
                modifiedArr[i] = arr[i];      // Keep odd numbers as is
            }
        }
        return modifiedArr;
    }
    
    // Step 2: Find maximum subarray sum without repeating numbers (sliding window)
    public static int maxSubarraySumWithoutDuplicates(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int left = 0;
        Set<Integer> seen = new HashSet<>();
        
        for (int right = 0; right < arr.length; right++) {
            // If element is already seen, remove elements from left until duplicate is removed
            while (seen.contains(arr[right])) {
                currentSum -= arr[left];
                seen.remove(arr[left]);
                left++;
            }
            
            // Add current element
            seen.add(arr[right]);
            currentSum += arr[right];
            
            // Update max sum
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("\nOriginal array: ");
        printArray(arr);
        
        // Modify array - decrement even numbers
        int[] modifiedArr = modifyArray(arr);
        System.out.println("\nModified array (even numbers decremented by 1): ");
        printArray(modifiedArr);
        
        // Find maximum subarray sum without repeating numbers
        int result = maxSubarraySumWithoutDuplicates(modifiedArr);
        System.out.println("\nMaximum subarray sum without repeating numbers: " + result);
        
        scanner.close();
    }
    
    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}