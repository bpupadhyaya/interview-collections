package com.equalinformation.interview.algo.java.test.string_and_array;

import com.equalinformation.interview.algo.java.string_and_array.RotateArrayS1IntermediateArray_O_n;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by bpupadhyaya on 6/13/16.
 */
public class RotateArrayS1IntermediateArray_O_nTest {

    @Test
    public void testRotateByValue() {
        RotateArrayS1IntermediateArray_O_n soln = new RotateArrayS1IntermediateArray_O_n();
        int[] givenArray = {10,11, 12,13,14};
        int k = 3;
        int[] result = soln.rotate(givenArray,k);
        assertEquals(result[0], 12);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRotateWrongRotationValue() {
        RotateArrayS1IntermediateArray_O_n soln = new RotateArrayS1IntermediateArray_O_n();
        int[] givenArray = {5,6, 7,8,9};
        int k = -1;
        soln.rotate(givenArray,k);
    }

}
