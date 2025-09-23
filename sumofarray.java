import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("The sum of the array elements is: " + sum/n);

        scanner.close();
    }
}