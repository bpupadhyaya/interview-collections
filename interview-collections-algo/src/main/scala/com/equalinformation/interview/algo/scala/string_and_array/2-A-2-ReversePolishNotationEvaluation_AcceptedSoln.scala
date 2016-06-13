package com.equalinformation.interview.algo.scala.string_and_array

  import java.util.Stack
/**
  * Created by bpupadhyaya on 6/12/16.
  */

object ReversePolishNotationEvaluation_AcceptedSolnTest {
  def main(args: Array[String]): Unit = {
    val soln = new ReversePolishNotationEvaluation_AcceptedSoln
    val tokens = Array("2","1","+","3","*")
    println("Result: " + soln.evalRPN(tokens))
  }
}

class ReversePolishNotationEvaluation_AcceptedSoln {

  def evalRPN(tokens: Array[String]): Int = {
    var returnValue = 0;

    val operators = "+-*/"

    val stack = new Stack[String]()
    for(t <- tokens) {
      if(!operators.contains(t)) {
        stack.push(t)
      } else {
        val a = Integer.valueOf(stack.pop())
        val b = Integer.valueOf(stack.pop())
        val index = operators.indexOf(t)

        index match {
          case 0 => stack.push(String.valueOf(a + b))
          case 1 => stack.push(String.valueOf(b - a))
          case 2 => stack.push(String.valueOf(a * b))
          case 3 => stack.push(String.valueOf(b / a))
        }
      }
    }

    returnValue = Integer.valueOf(stack.pop())

    returnValue
  }
}
