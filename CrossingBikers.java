import java.util.Scanner;

public class CrossingBikers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long zerosSeen = 0;
        long pairs = 0;

        for (int i = 0; i < T; i++) {
            int val = sc.nextInt();
            if (val == 0) {
                zerosSeen++;
            } else if (val == 1) {
                pairs += zerosSeen;
            } else {
                // If input may contain non-binary values, you can handle error here.
            }
        }
        sc.close();

        System.out.println(pairs);
    }
}

