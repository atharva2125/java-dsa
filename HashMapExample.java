import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding values
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Fetching values
        System.out.println(map.get("Banana")); // Output: 2

        // Checking if key exists
        System.out.println(map.containsKey("Apple")); // true

        // Removing a key
        map.remove("Orange");

        // Iterating through HashMap
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
