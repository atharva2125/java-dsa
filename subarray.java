import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class subarray {
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;

        
        for (int i = 0; i <= s.size() - m; i++) {
   
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

      
        System.out.print("Enter the number of squares in the chocolate bar: ");
        int n = scanner.nextInt();
 
        System.out.println("Enter the values of the chocolate bar squares: ");
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(scanner.nextInt());
        }
 
        System.out.print("Enter Ron's birth day (d): ");
        int d = scanner.nextInt();

        System.out.print("Enter Ron's birth month (m): ");
        int m = scanner.nextInt();

     
        int result = birthday(s, d, m);
        System.out.println("Number of ways to divide the chocolate: " + result);

        scanner.close();
    }
}