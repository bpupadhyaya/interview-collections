package com.equalinformation.interview.algo.scala.string_and_array
import java.lang.System.arraycopy


/**
  * Created by bpupadhyaya on 6/12/16.
  */

object RotateArrayS1IntermediateArray_O_nTest {
  def main(args: Array[String]): Unit = {
    val soln = new RotateArrayS1IntermediateArray_O_n
    val givenArray = Array(1, 2, 3, 4, 5)
    val k = 2
    soln.rotate(givenArray, k)

  }
}

class RotateArrayS1IntermediateArray_O_n {

  def rotate(nums: Array[Int], k: Int): Unit = {
    var k_var = k;

    if(k_var > nums.length) {
      k_var = k_var % nums.length
    }

    val result = new Array[Int](nums.length)

    for(i <- 0 to k_var - 1 ) {
      result(i) = nums(nums.length - k_var + i)
    }

    var j: Int = 0
    for(i <- k_var to nums.length - 1 ) {
      result(i) = nums(j)
      j+= 1
    }

    arraycopy(result,0,nums,0,nums.length)

   System.out.println("Rotated array: ")
    for(i<- result) {
      print(i+", ")
    }

  }

}


