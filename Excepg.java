public class Excepg {
    public static void main(String[] args) {
        try {
            int myInt = Integer.parseInt("1");
            //Code that may cause exception
        }
        catch(Exception e) {
            //Code to handle exception
            System.out.println("Invalid input");
        }
        System.out.println("ends here");
    }
}
