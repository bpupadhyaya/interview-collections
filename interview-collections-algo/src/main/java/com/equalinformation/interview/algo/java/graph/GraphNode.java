package com.equalinformation.interview.algo.java.graph;

/**
 * Created by bpupadhyaya on 3/8/16.
 */
public class GraphNode {
    int value;
    GraphNode next;
    GraphNode[] neighbors;
    boolean visited;

    GraphNode(int x) {
        value = x;
    }

    GraphNode(int x, GraphNode[] n) {
        value = x;
        neighbors = n;
    }

    public String toString() {
        return "Value: "+this.value;
    }
}
