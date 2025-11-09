import java.util.*;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        
        int pos=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0) arr[pos++]=arr[i];
        }
        while(pos<n) arr[pos++]=0;
        
        for(int num: arr) System.out.print(num + " ");
    }
}
