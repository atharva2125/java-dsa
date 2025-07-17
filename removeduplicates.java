import java.util.Arrays;

class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int l = 1;
        for (int r = 1; r < nums.length; r++) {
            if (nums[r] != nums[r - 1]) {
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        removeDuplicates sol = new removeDuplicates();

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 4, 4};

        int newLength = sol.removeDuplicates(nums);

        System.out.println("New length after removing duplicates: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
