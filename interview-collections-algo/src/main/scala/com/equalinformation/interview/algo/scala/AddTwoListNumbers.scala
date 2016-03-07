package com.equalinformation.interview.algo.scala

/**
  * Created by bpupadhyaya on 3/6/16.
  *
  * Add non-negative numbers in two lists (first element is added with
  * corresponding first element) and return the result as a list.
  * Example input: (1 -> 2 -> 3) + (4 -> 5 -> 6), output: (5 -> 7 -> 9)
  *
  * Note: Compare the code below with that of Java implementation in
  * AddTwoLinkedListNumbers.java
  */
object AddTwoListNumbers extends App {

  val list1 = List(1,2,3)
  val list2 = List(4,5,6)

  println((list1 zip list2) map {p => p._1 + p._2})

}
