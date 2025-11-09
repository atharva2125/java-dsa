import java.util.*;

public class ConsecutiveVowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int count = 0;
        
        for(int i=0;i<s.length()-1;i++){
            if(isVowel(s.charAt(i)) && isVowel(s.charAt(i+1))) count++;
        }
        
        System.out.println(count);
    }
    
    public static boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}
