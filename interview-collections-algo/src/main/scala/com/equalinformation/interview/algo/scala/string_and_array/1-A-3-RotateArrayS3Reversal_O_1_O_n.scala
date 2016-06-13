package com.equalinformation.interview.algo.scala.string_and_array

/**
  * Created by bpupadhyaya on 6/12/16.
  */

object RotateArrayS3Reversal_O_1_O_nTest {
  def main(args: Array[String]): Unit = {
    val soln = new RotateArrayS3Reversal_O_1_O_n
    val givenArray = Array(1,2,3,4,5)
    val k = 2
    soln.rotate(givenArray,k)
  }
}

class RotateArrayS3Reversal_O_1_O_n {

  def rotate(nums: Array[Int], k: Int): Unit = {
    var kTemp = k
    kTemp = kTemp % nums.length

    val a = nums.length - k

    reverse(nums, 0, a - 1)
    reverse(nums, a, nums.length - 1)
    reverse(nums, 0, nums.length -1)

    println("Rotated array: ")
    for(element <- nums) {
      print(element + ", ")
    }
  }

  def reverse(nums: Array[Int], left: Int, right: Int): Unit = {
    var l = left; var r = right
    if(nums == null || nums.length ==1)
      return

    while(l < r) {
      val temp = nums(l)
      nums(l) = nums(r)
      nums(r) = temp
      l += 1
      r -= 1
    }
  }
}

