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
        majorityelement solution = new majorityelement();
        int[] nums = {3, 2, 3};
        System.out.println("Majority Element: " + solution.majorityElement(nums));
    }
}