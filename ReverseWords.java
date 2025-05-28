public class ReverseWords {
    public static String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();
        
        // Split words by multiple spaces
        String[] words = s.split("\\s+");
        
        // Reverse the words using StringBuilder
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i > 0) {
                reversedString.append(" ");
            }
        }
        
        return reversedString.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue")); // Output: "blue is sky the"
        System.out.println(reverseWords("  hello world  ")); // Output: "world hello"
        System.out.println(reverseWords("a good   example")); // Output: "example good a"
    }
}