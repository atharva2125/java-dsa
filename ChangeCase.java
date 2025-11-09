import java.util.Scanner;
public class ChangeCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);
        StringBuilder result = new StringBuilder();
            if(Character.isLowerCase(ch)){
                 ch=Character.toUpperCase(ch);
            }
            else{
                ch=Character.toLowerCase(ch);
            }
             System.out.println(ch);
        sc.close();
    }
     
}
