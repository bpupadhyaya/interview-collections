package com.equalinformation.interview.algo.java.linked_list;

/**
 * Created by bpupadhyaya on 3/6/16.
 */
public class Stack {
    LinkedList top;

    public LinkedList peek() {
        if(top != null) {
            return top;
        }
        return null;
    }

    public LinkedList pop() {
        if(top == null) {
            return null;
        } else {
            LinkedList temp = new LinkedList((top.val));
            top = top.next;
            return temp;
        }
    }

    public void push(LinkedList n) {
        if(n != null) {
            n.next = top;
            top = n;
        }
    }
}
