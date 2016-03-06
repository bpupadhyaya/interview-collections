package com.equalinformation.interview.algo.java.string_and_array;

/**
 * Due to: ProgramCreek
 * Re-Created by bpupadhyaya on 3/5/16.
 *
 * Problem: Rotate an array of n elements to the right by k steps.
 * For example, with n = 5 and k = 2, the array [1,2,3,4,5] is
 * rotated to [4,5,1,2,3]. How many different ways do you know to
 * solve this problem?
 *
 * Solution note: Space is O(n) and time is O(n). You can check out the
 * difference between System.arraycopy() and Arrays.copyOf()
 */
public class RotateArrayS1IntermediateArray_O_n {

    public static void main(String...args) {
        RotateArrayS1IntermediateArray_O_n soln = new RotateArrayS1IntermediateArray_O_n();
        int[] givenArray = {1,2,3,4,5};
        int k = 2;
        soln.rotate(givenArray,k);
    }

    public void rotate(int[] nums, int k) {
        if(k > nums.length) {
            k = k % nums.length;
        }
        int[] result = new int[nums.length];

        for(int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }

        int j = 0;
        for(int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }

        System.arraycopy(result,0,nums,0,nums.length);

        System.out.println("Rotated array: ");
        for(int i: result) {
            System.out.print(i+", ");
        }
    }

}
