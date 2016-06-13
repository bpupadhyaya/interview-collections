package com.equalinformation.interview.algo.scala.test.string_and_array

import com.equalinformation.interview.algo.scala.string_and_array.RotateArrayS1IntermediateArray_O_n
import org.scalatest.FlatSpec

/**
  * Created by bpupadhyaya on 6/13/16.
  */
class RotateArrayS1IntermediateArraySpec extends FlatSpec {

  "Rotate array" should "rotate elements by specified number of times" in {
    val soln = new RotateArrayS1IntermediateArray_O_n
    val givenArray = Array(10,11,12,13,14)
    val k = 3
    val result = soln.rotate(givenArray,k)
    assert(result(0) == 12 )
  }

  it should "throw ArrayIndexOutOfBoundException if rotation value is less than 0" in {
    val soln = new RotateArrayS1IntermediateArray_O_n
    val givenArray = Array(9,8,7,6)
    val k = -1
    intercept[ArrayIndexOutOfBoundsException] {
      soln.rotate(givenArray,k)
    }
  }


}
