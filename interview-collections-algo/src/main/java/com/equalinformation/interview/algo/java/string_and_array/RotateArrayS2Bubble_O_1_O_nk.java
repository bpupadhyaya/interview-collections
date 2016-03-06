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
 * Solution note: Space is O(1) and time is O(n * k).
 */
public class RotateArrayS2Bubble_O_1_O_nk {

    public static void main(String...args) {
        RotateArrayS2Bubble_O_1_O_nk soln = new RotateArrayS2Bubble_O_1_O_nk();
        int[] givenArray = {1,2,3,4,5};
        int k = 2;
        soln.rotate(givenArray,k);
    }

    public void rotate(int[] nums, int k) {
        if(nums == null || k < 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }

        for(int i = 0; i < k; i++) {
            for(int j = nums.length - 1; j > 0; j--) {
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
            }
        }

        System.out.println("Rotated array: ");
        for(int i: nums) {
            System.out.print(i+", ");
        }
    }

}
