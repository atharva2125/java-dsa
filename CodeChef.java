 // Click on 'Submit' to view the results
// Click on 'Next' to proceed
import java.util.*;

class Codechef
{
	public static void main (String[] args)
	{   
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(12);
        numbers.add(25);
        numbers.add(34);
        numbers.add(46);

        // Remove element equal to 25
        for (int i = 0; i<numbers.size(); i++) {
            if (numbers.get(i) == 34) {
                numbers.remove(i);
                break;
            }
        }
        
        System.out.println(numbers);
	    // Create an ArrayList
		ArrayList<String> codechef = new ArrayList<>();
		
		// Add elements
		codechef.add("chef");
        codechef.add("chefina");
        codechef.add("camera");
        System.out.println("ArrayList with 2 Strings: " + codechef);
        
        // Access element
        System.out.println("First element of the ArrayList: " + codechef.get(0));
        
        // Remove element
        codechef.remove(1);
        System.out.println("First element removed: " + codechef);
        
        // Change element
        codechef.set(0, "code");
        System.out.println("First element changed to: " + codechef.get(0));
        
        // size of the ArrayList
        System.out.print("Size of/number of elements in the ArrayList: " + codechef.size());
	}
}

