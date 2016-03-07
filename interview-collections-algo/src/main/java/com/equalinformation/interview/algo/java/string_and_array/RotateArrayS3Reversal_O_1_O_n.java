package com.equalinformation.interview.algo.java.string_and_array;

/**
 * Due to: ProgramCreek
 * Re-Created by bpupadhyaya on 3/6/16.
 *
 * Problem: Rotate an array of n elements to the right by k steps.
 * For example, with n = 5 and k = 2, the array [1,2,3,4,5] is
 * rotated to [4,5,1,2,3]. How many different ways do you know to
 * solve this problem?
 *
 * Solution note: Space is O(1) and time is O(n).
 */
public class RotateArrayS3Reversal_O_1_O_n {

    public static void main(String...args) {
        RotateArrayS3Reversal_O_1_O_n soln = new RotateArrayS3Reversal_O_1_O_n();
        int[] givenArray = {1,2,3,4,5};
        int k = 2;
        soln.rotate(givenArray,k);
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        if(nums == null || k < 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }

        int a = nums.length - k;

        reverse(nums, 0, a - 1);
        reverse(nums, a, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

        System.out.println("Rotated array: ");
        for(int i: nums) {
            System.out.print(i+", ");
        }
    }

    public void reverse (int[] nums, int left, int right) {
        if(nums == null || nums.length == 1)
            return;

        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
