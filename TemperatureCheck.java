import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the temperature (n): ");
        int n = scanner.nextInt();

        // Checking the condition and printing result
        if (n < 15) {
            System.out.println("IT's Cold");
        } else {
            System.out.println("IT's not Cold");
        }

        scanner.close();
    }
}
