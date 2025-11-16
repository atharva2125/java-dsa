import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class oa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the length of the array
        int N = scanner.nextInt();
        int[] nums = new int[N];
        
        // Read the elements of the array
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Read the target sum k
        int k = scanner.nextInt();
        
        // Compute the result
        int result = subarraySum(nums, k);
        
        // Print the result
        System.out.println(result);
        
        scanner.close();
    }


    public static int subarraySum(int[] nums, int k) {
        // HashMap to store the prefix sums and their counts
        Map<Integer, Integer> prefixSumCounts = new HashMap<>();
        prefixSumCounts.put(0, 1);
        
        int count = 0;
        int sum = 0;
        
        for (int num : nums) {
            sum += num;
            
            // Check if the (current sum - k) exists in the prefix sums map
            if (prefixSumCounts.containsKey(sum - k)) {
                count += prefixSumCounts.get(sum - k);
            }
            
            // Update the prefix sums map
            prefixSumCounts.put(sum, prefixSumCounts.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
