package com.equalinformation.interview.algo.scala.string_and_array

import java.util

/**
  * Created by bpupadhyaya on 6/12/16.
  */

object ReversePolishNotationEvaluation_NaiveTest extends App {
  val soln = new ReversePolishNotationEvaluation_Naive
  val tokens = Array("2","1","+","3","*")
  println("Result: " + soln.evalRPN(tokens))
}

class ReversePolishNotationEvaluation_Naive {

  def evalRPN(tokens: Array[String]): Int = {
    var returnValue = 0
    val operators = "+-*/"

    val stack = new util.Stack[String]()
    for(t <- tokens) {
      if(!operators.contains(t)) {
        stack.push(t)
      } else {
        val a = Integer.valueOf(stack.pop())
        val b = Integer.valueOf(stack.pop())

        t match {
          case "+" => stack.push(String.valueOf(a + b))
          case "-" => stack.push(String.valueOf(b - a))
          case "*" => stack.push(String.valueOf(a * b))
          case "/" => stack.push(String.valueOf(b / a))
        }
      }
    }

    returnValue = Integer.valueOf(stack.pop())

    returnValue
  }
}
