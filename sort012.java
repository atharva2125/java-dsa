import java.util.Scanner;

class sort012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    
        int c0 = 0, c1 = 0, c2 = 0;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0)
                c0++;
            else if(arr[i] == 1)
                c1++;
            else if(arr[i] == 2)
                c2++;
        }
        
        int idx = 0;
        for(int i = 0; i < c0; i++) {
            arr[idx++] = 0;
        }
        for(int i = 0; i < c1; i++) {
            arr[idx++] = 1;
        }
        for(int i = 0; i < c2; i++) {
            arr[idx++] = 2;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    }
