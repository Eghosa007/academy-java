package com.bptn.course._04_arrays;

public class InsertPosition {

	public static int searchInsert(int[] nums, int target) {
		
		int n = nums.length;
        // this will Iterate through the array to find the target or insert position
        for (int i = 0; i < n; i++) {
            // If the target is found or if the target is smaller than the current number
            if (nums[i] >= target) {
                return i;
            }
        }
        
        return n;
    }

    public static void main(String[] args) {
        // Targets and arrays
        int nums[] = {1, 3, 5, 7, 9};
        int target = 9;

        int nums1[] = {1, 3, 5, 6};
        int target1 = 3;

        int nums2[] = {1, 3, 5, 6, 7};
        int target2 = 7;

        // Outcome
        System.out.println(searchInsert(nums, target));   // Expected output: 4
        System.out.println(searchInsert(nums1, target1)); // Expected output: 1
        System.out.println(searchInsert(nums2, target2)); // Expected output: 4
    }
}
		
