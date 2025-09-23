import java.util.HashMap;
import java.util.Scanner;

public class capnew {
     
    public static char frequencySort(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        s=s.toLowerCase();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(map.get(c)==2){
                return c;
            }
        }
        return '\0'; // Return a default value if no character found
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char result=frequencySort(s);

        sc.close();
        if (result != '\0') {
            System.out.println("First character with frequency 2: " + result);
        } else {
            System.out.println("No character found with frequency 2.");
        }
    }
}
    

