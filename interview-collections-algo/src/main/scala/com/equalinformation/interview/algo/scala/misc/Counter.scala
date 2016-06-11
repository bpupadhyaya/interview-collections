package com.equalinformation.interview.algo.scala.misc

/**
  * Created by bpupadhyaya on 6/10/16.
  */
class Counter {

  private var value = 0

  def increment(): Unit = {
    value += 1
  }

  def current() = value

}
