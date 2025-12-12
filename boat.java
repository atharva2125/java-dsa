import java.util.*;

public class boat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        // Input array a
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Input array b
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int sum = 0;
        int max = sum;

        // Calculate max value of (sum + a[i] - b[i])
        for (int i = 0; i < n; i++) {
            sum = sum + a[i] - b[i];
            if (max < sum) {
                max = sum;
            }
        }

        System.out.println(max);
        sc.close();
    }
}
