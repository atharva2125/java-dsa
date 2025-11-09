import java.util.Scanner;

public class MoveHashToFront {

    public static String moveHashesToFront(String str) {
        StringBuilder hashes = new StringBuilder();
        StringBuilder letters = new StringBuilder();

        // Traverse the string
        for (char c : str.toCharArray()) {
            if (c == '#') {
                hashes.append(c);   // collect #
            } else {
                letters.append(c);  // collect alphabets
            }
        }

        // Place all # first, then remaining characters
        return hashes.append(letters).toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        String result = moveHashesToFront(input);
        System.out.println("Modified string: " + result);

        sc.close();
    }
}
