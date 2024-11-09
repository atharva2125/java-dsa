import java.util.*;

public class star {
    public static void print(int n){
       int a,b;
       for(a=1;a<=n;a++){
        for(b=1;b<=n-a;b++){
            System.out.print(" ");
        }
        for(b=1;b<=a;b++){
            System.out.print("* ");
        }
       System.out.println();
       }
}

public static void main(String args[])
{
    int n=6;
    print(n);
}
}