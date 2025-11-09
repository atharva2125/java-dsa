import java.util.Scanner;

public class oa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int weight = scanner.nextInt();
        
        
        int distance = scanner.nextInt();
        
      
        double totalCost = calculateShippingCost(weight, distance);
   
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
