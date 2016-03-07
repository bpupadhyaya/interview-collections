package com.equalinformation.interview.algo.java.linked_list;

/**
 * Due to : ProgramCreek
 * Re-Created by bpupadhyaya on 3/6/16.
 *
 * Add non-negative numbers in two linked lists (first element is added with
 * corresponding first element) and return the result as a linked list.
 * Example input: (1 -> 2 -> 3) + (4 -> 5 -> 6), output: (5 -> 7 -> 9)
 *
 * Note: Compare this code with that of scala implementation in AddTwoListNumbers.scala
 */
public class AddTwoLinkedListNumbers {

    public static void main(String...args) {
        AddTwoLinkedListNumbers listAdder = new AddTwoLinkedListNumbers();
        Node l1 = new Node(1);
        l1.next = new Node(2);

        Node l2 = new Node(4);
        l2.next = new Node(5);

        Node l3 = listAdder.addTwoNumbers(l1, l2);

        System.out.println("Result: "+l3.val+" -> "+l3.next.val);

    }

    public Node addTwoNumbers(Node l1, Node l2) {
        int carry = 0;
        Node newHead = new Node(0);
        Node p1 = l1, p2 = l2, p3 = newHead;

        while(p1 != null || p2 != null) {
            if(p1 != null) {
                carry += p1.val;
                p1 = p1.next;
            }

            if(p2 != null) {
                carry += p2.val;
                p2 = p2.next;
            }

            p3.next = new Node(carry % 10);
            p3 = p3.next;
            carry /= 10;
        }

        if(carry == 1)
            p3.next = new Node(1);

        return newHead.next;
    }
}
