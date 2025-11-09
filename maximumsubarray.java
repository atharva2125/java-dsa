import java.util.Scanner;

class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        int res=arr[0];
        int prefix=1;
        int suffix=1;
        for(int i=0;i<n;i++){
            prefix=prefix*arr[i];
            suffix=suffix*arr[n-i-1];
            res=Math.max(res,Math.max(prefix,suffix));
            if(arr[i]==0){
                prefix=1;
            }
            if(arr[n-i-1]==0){
                suffix=1;
            }
        }
        return res;
        
    }
    public static void main(String[] args){
        Solution sol=new Solution();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sol.maxProduct(arr));
    }
}