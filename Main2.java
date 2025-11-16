public class Main2 {

    // Method to count outstanding words
    public static int countOutstandingWords(String s) {
        String[] words = s.split("\\s+"); // split by spaces
        int count = 0;

        String outstandingLetters = "housrwv"; // letters to check

        for (String w : words) {
            for (char c : w.toCharArray()) {
                if (outstandingLetters.indexOf(c) != -1) {
                    count++;
                    break; // stop checking this word
                }
            }
        }

        return count;
    }

    // Main method
    public static void main(String[] args) {
        String sentence = "hssn and ao ou outstanding";

        int result = countOutstandingWords(sentence);

        System.out.println("Outstanding words count: " + result);
    }
}
