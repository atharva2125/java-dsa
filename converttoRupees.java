import java.util.Scanner;

class converttoRupees {
    public static double convertFromRupees(int rupees, char currency) {
        switch (currency) {
            case 'Y': return rupees / 10.0;     // Convert to Yuan
            case 'P': return rupees / 100.0;    // Convert to Pound
            case 'D': return rupees / 70.0;     // Convert to Dollar
            case 'R': return rupees;            // Keep as Rupee
            default: 
                throw new IllegalArgumentException("Invalid currency: " + currency);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter amount in Rupees: ");
        int rupees = scanner.nextInt();
        
        System.out.print("Enter target currency (Y/P/D/R): ");
        char currency = scanner.next().charAt(0);
        
        try {
            double result = convertFromRupees(rupees, currency);
            String currencyName = switch(currency) {
                case 'Y' -> "Yuan";
                case 'P' -> "Pounds";
                case 'D' -> "Dollars";
                case 'R' -> "Rupees";
                default -> "Unknown";
            };
            System.out.printf("%d Rupees = %.2f %s%n", rupees, result, currencyName);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}