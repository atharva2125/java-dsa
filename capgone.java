import java.util.HashMap;

public class capgone {
    String removeDuplicates(String s) {
        HashMap<Character, Integer> newmap=new HashMap<>();
        StringBuilder news=new StringBuilder();
        for(char c:s.toCharArray()){
            newmap.put(c,newmap.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(newmap.get(c)==1){
                news.append(c);
            }
        }
        return news.toString();
    }
    public static void main(String[] args){
        capgone obj=new capgone();
        String s="abacddbec";
        String result=obj.removeDuplicates(s);
        System.out.println("String after removing duplicates: " + result);
    }
}
