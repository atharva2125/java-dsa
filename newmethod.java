import java.util.*;

public class newmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();  // Read input string
        StringBuilder hashes = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == '#') {
                hashes.append(c);
            } else {
                letters.append(c);
            }
        }
        
        System.out.println(hashes.toString() + letters.toString());
    }
}

