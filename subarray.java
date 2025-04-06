import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class subarray {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;

        // Iterate through the chocolate bar
        for (int i = 0; i <= s.size() - m; i++) {
            // Calculate the sum of the current segment
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }
            if (sum == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the chocolate bar
        System.out.print("Enter the number of squares in the chocolate bar: ");
        int n = scanner.nextInt();

        // Read the chocolate bar array
        System.out.println("Enter the values of the chocolate bar squares: ");
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(scanner.nextInt());
        }

        // Read Ron's birth day and birth month
        System.out.print("Enter Ron's birth day (d): ");
        int d = scanner.nextInt();

        System.out.print("Enter Ron's birth month (m): ");
        int m = scanner.nextInt();

        // Calculate and print the result
        int result = birthday(s, d, m);
        System.out.println("Number of ways to divide the chocolate: " + result);

        scanner.close();
    }
}