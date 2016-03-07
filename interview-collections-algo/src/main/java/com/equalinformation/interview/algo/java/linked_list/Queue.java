package com.equalinformation.interview.algo.java.linked_list;

/**
 * Created by bpupadhyaya on 3/6/16.
 */
public class Queue {
    Node first, last;

    public void enqueue(Node n) {
        if(first == null) {
            first = n;
            last = first;
        } else {
            last.next = n;
            last = n;
        }
    }

    public Node dequeue() {
        if(first == null) {
            return null;
        } else {
            Node temp = new Node(first.val);
            first = first.next;
            return temp;
        }
    }
}
