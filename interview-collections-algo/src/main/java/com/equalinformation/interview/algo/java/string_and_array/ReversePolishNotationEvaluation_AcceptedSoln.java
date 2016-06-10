package com.equalinformation.interview.algo.java.string_and_array;

import java.io.IOException;
import java.util.Stack;

/**
 * Due to: ProgramCreek
 * Created by bpupadhyaya on 6/10/16.
 *
 * Problem: Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Examples:
 * ["2","1","+","3","*"] -> ((2+1)*3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4+(13/5)) -> 6
 *
 * Solution note: Valid operators are +, -, *, /. Each operand may be an integer
 * or another expression.
 */
public class ReversePolishNotationEvaluation_AcceptedSoln {
    public static void main(String...args) throws IOException {
        String[] tokens = new String[] {"2","1","+","3","*"};
        System.out.println("Result: "+evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        int returnValue = 0;

        String operators = "+-*/";

        Stack<String> stack = new Stack<String>();

        for(String t: tokens) {
            if(!operators.contains(t)) {
                stack.push(t);
            } else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                int index = operators.indexOf(t);

                switch(index) {
                    case 0:
                        stack.push(String.valueOf(a + b));
                        break;
                    case 1:
                        stack.push(String.valueOf(b -a));
                        break;
                    case 2:
                        stack.push(String.valueOf(a * b));
                        break;
                    case 3:
                        stack.push(String.valueOf(b /a));
                        break;
                }
            }
        }

        returnValue = Integer.valueOf(stack.pop());

        return returnValue;
    }
}
