// Java program to demonstrate 
// the working of finally block
public class exception {
    public static void main(String[] args)
    {
      
        try {
            System.out.println("Inside try block");
            int result
                = 10 / 0; // This will cause an exception
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: "
                               + e.getMessage());
        }
        finally {
            System.out.println(
                "finally block always execute");
        }
    }
}