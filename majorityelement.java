import java.util.Scanner;

class majorityelement {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int ans=0;
        int freq=0;
        for(int i=0;i<n;i++){
            if(freq==0){
                ans=nums[i];
            }
            if(ans==nums[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        majorityelement solution = new majorityelement();
        int result = solution.majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}