package com.equalinformation.interview.algo.scala.string_and_array

/**
  * Created by bpupadhyaya on 6/12/16.
  */

object ReverseWordsInAStringTest extends App {

  val revUtil = new ReverseWordsInAString
  var words = "Sunnyvale is sunny".toCharArray
  print("Input: ");
  for(eachChar <- words) {
    print(eachChar)
  }
  println

  revUtil.reverseWords(words)

  print("Output: ")
  for(eachChar <- words) {
    print(eachChar)
  }

}

class ReverseWordsInAString {

  def reverseWords(s: Array[Char]): Unit = {
    var i = 0
    for(j <- 0 to s.length - 1) {
      if(s(j) == ' ') {
        reverse(s, i, j - 1)
        i = j + 1
      }
    }

    reverse(s, i, s.length - 1)
    reverse(s, 0, s.length - 1)
  }

  def reverse(s: Array[Char], i: Int, j: Int): Unit = {
    var tempI = i; var tempJ = j
    while(tempI < tempJ) {
      val temp = s(tempI)
      s(tempI) = s(tempJ)
      s(tempJ) = temp
      tempI += 1
      tempJ -= 1
    }
  }
}

