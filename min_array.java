import java.util.*;

public class min_array {
    public static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
}

public static void main(String[] args) {
    int[] arr = { 35, 20, 30, 40, 50 };
    System.out.println(min(arr));

}
}
