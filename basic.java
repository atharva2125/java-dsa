import java.util.*;

public class basic {
    public static void main(String[] args) {
        // Using ArrayList
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("ArrayList: " + list);

        // Using HashSet
        Set<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Apple");
        set.add("Orange"); // Duplicate element, will not be added
        System.out.println("HashSet: " + set);

        // Using HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println("HashMap: " + map);

        // Using PriorityQueue
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Lemon");
        queue.add("Apple");
        queue.add("Banana");
        System.out.println("PriorityQueue: " + queue);
    }
}
