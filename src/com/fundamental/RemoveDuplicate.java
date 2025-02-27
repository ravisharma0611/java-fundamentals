package com.fundamental;
public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int filtered = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[filtered] != nums[i]) {
                filtered++;
                nums[filtered] = nums[i];
            }
        }

        return filtered + 1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 2, 2, 6};
        int length = removeDuplicates(nums);

        System.out.println("Length of modified array: " + length);
        // The modified array will contain [1, 2]
    }
}
