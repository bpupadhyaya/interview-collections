package com.equalinformation.interview.algo.java.misc;

import com.equalinformation.interview.algo.scala.misc.Counter;

/**
 * Created by bpupadhyaya on 6/10/16.
 */
public class TestScalaImport {
    public static void main(String...args) {
        Counter counter = new Counter();
        System.out.println("Testing scala import: current value: "+counter.current());
        counter.increment();
        System.out.println("Testing scala import: increment: "+counter.current());
    }
}
