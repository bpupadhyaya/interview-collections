package com.equalinformation.interview.algo.scala.string_and_array

/**
  * Created by bpupadhyaya on 6/12/16.
  */

object RotateArrayS2Bubble_O_1_O_nkTest {
  def main(args: Array[String]): Unit = {
    val soln = new RotateArrayS2Bubble_O_1_O_nk
    val givenArray = Array(1,2,3,4,5)
    val k = 2
    soln.rotate(givenArray, k)
  }

}

class RotateArrayS2Bubble_O_1_O_nk {
  def rotate(nums: Array[Int], k: Int): Unit = {

    val tempNums = nums.clone()

    if(tempNums == null || k < 0) {
      throw new IllegalArgumentException("Invalid arguments")
    }

    for(i <- 0 to k - 1) {
      for(j <- tempNums.length -1 to 1 by -1) {
        val temp = tempNums(j);
        tempNums(j) = tempNums(j-1)
        tempNums(j-1) = temp

      }
    }

    println("Rotated array: ")
    for(element <- tempNums) {
      print(element+", ")
    }
  }
}
