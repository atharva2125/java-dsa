import java.util.*;

class prime {
    public static boolean isPrime(int num) {
         int i=2;
         while (i < num) {
              if (num % i == 0) {
                 return false;
              }
              i++;
            }
        return true;
    }

    public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome");
       System.out.print("Enter number");
       int a = input.nextInt();
       boolean p = isPrime(a);
       if (p) {
        System.out.println("Your number is Prime");
       }
       else{
        System.out.println("Your number is not prime");
       }
    }
}