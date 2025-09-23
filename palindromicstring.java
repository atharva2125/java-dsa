import java.util.Scanner;

class palindromicstring {
  
    // Function to check if a string is a palindrome
    public static int isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return 0;
            left++;
            right--;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String s = scanner.nextLine();
        
        int result = isPalindrome(s);
        if (result == 1)
            System.out.println("The string is a palindrome");
        else
            System.out.println("The string is not a palindrome");
            
        scanner.close();
    }
}