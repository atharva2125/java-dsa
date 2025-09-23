 
import java.util.Scanner;

public class BulbStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input from user
        System.out.print("Enter the sequence of bulbs: ");
        String sequence = sc.nextLine();

        // bulbs[0] -> bulb0, bulbs[1] -> bulb1, bulbs[2] -> bulb2
        int[] bulbs = new int[3];  // default OFF (0)

        // process sequence
        for (char ch : sequence.toCharArray()) {
            int idx = ch - '0';        // convert '0','1','2' to 0,1,2
            bulbs[idx] = 1 - bulbs[idx]; // toggle bulb
        }

        // build output string
        StringBuilder result = new StringBuilder();
        for (int state : bulbs) {
            result.append(state);
        }

        // final status
        System.out.println("Final status of bulbs (bulb0, bulb1, bulb2): " + result);
        
        sc.close();
    }
}
