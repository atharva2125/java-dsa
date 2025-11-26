import java.util.Scanner;

class Solutionroot {
    public int smallestNumber(int n) {
        int start = (int)Math.pow(10, n-1);
        int end = (int)Math.pow(10, n);

        for (int i = start; i < end; i++) {
            if (String.valueOf(i).contains("0")) continue;

            int sum = 0;
            int temp = i;
            while (temp > 0) {
                int d = temp % 10;
                sum += d * d * d;
                temp /= 10;
            }

            int sqrt = (int)Math.sqrt(sum);
            if (sqrt * sqrt == sum) {
                return i;
            }
        }
        return -1; // if not found
    }
    public static void main(String[] args) {
        Solutionroot obj = new Solutionroot();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits (n): ");
        int n = sc.nextInt();
        
        int result = obj.smallestNumber(n);
        System.out.println("Smallest " + n + "-digit number: " + result);
    }
}
