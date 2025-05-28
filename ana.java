import java.util.HashMap;

public class ana {

    static HashMap<Character, Integer> makefrequencyMap(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    public boolean isanagram(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = makefrequencyMap(s1);
        HashMap<Character, Integer> map2 = makefrequencyMap(s2);
        return map1.equals(map2);
    }
}
