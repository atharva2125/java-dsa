import java.util.Scanner;

public class oa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the weight of the package
        int weight = scanner.nextInt();
        
        // Read the distance the package needs to travel
        int distance = scanner.nextInt();
        
        // Calculate the total shipping cost
        double totalCost = calculateShippingCost(weight, distance);
        
        // Print the total shipping cost
        System.out.printf("%.2f%n", totalCost);
        
        scanner.close();
    }

    public static double calculateShippingCost(int weight, int distance) {
        double baseCost = 5.00;
        double costPerKg = 2.00;
        double costPer10Km = 0.50;
        
        double weightCost = weight * costPerKg;
        double distanceCost = (distance / 10.0) * costPer10Km;
        
        return baseCost + weightCost + distanceCost;
    }
}
