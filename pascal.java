import java.util.*;

public class pascal {
    public static void print(int n){
        int a,b;
        for(a=1;a<=n;a++){
         for(b=0;b<=n-a;b++){
             System.out.print(" ");
         }
         int x=1;
         for(int k=1;k<=a;k++){
            System.out.print(x + " ");
            x=x*(a-k)/k;
         }
        System.out.println();
        }
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    print(n);
}
}
