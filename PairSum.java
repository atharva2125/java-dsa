import java.util.*;

public class PairSum {
    static int pairSum(int[] arr,  int x) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }
        return count;
    }
    

 public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int x = 10;
    System.out.println(pairSum(arr,  x));
 }
}