package com.equalinformation.interview.algo.java.graph;

/**
 * Due to: ProgramCreek
 * Created by bpupadhyaya on 3/8/16.
 */
public class Queue {
    GraphNode first, last;

    public void enqueue(GraphNode n) {
        if(first == null) {
            first = n;
            last = first;
        } else {
            last.next = n;
            last = n;
        }
    }

    public GraphNode dequeue() {
        if(first == null) {
            return null;
        } else {
            GraphNode temp = new GraphNode(first.value, first.neighbors);
            first = first.next;
            return temp;
        }
    }
}
