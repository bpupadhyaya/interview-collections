package com.equalinformation.interview.algo.scala.misc

import com.equalinformation.interview.algo.java.misc

/**
  * Created by bpupadhyaya on 6/10/16.
  */
object TestJavaImport extends App {
  val counter: misc.Counter = new misc.Counter()

  println("Testing java import: current : " + counter.getCurrent)
  counter.increment()
  println("Testing java import: increment: " + counter.getCurrent)

}
