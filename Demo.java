import java.util.Map;
import java.util.HashMap;

public class Demo {
   public static void main(String a[]) {
       Map<String, Integer> students = new HashMap<>();
       students.put("John", 20);
       students.put("Alice", 22);
       students.put("Bob", 21);
       students.put("Charlie", 20);

       System.out.println(students);
   } 
}
