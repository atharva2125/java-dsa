import java.util.HashMap;

   static HashMap<Character, Integer> makefrequencyMap(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

public class ana {
    public boolean isanagram(String s1, String s2) {
     if(s1.length() != s2.length()) {
         return false;
     }
     static HashMap<Character, Integer> map1 = new HashMap<>();
     static HashMap<Character, Integer> map2 = new HashMap<>();
     return map1.equals(map2);
    }
}
