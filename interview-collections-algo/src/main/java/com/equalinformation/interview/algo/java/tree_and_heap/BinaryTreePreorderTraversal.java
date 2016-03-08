package com.equalinformation.interview.algo.java.tree_and_heap;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Due to: ProgramCreek
 * Created by bpupadhyaya on 3/7/16.
 *
 * Problem: Preorder (parent node first) traversal of binary tree.
 */
public class BinaryTreePreorderTraversal {

    public static void main(String...args) {
        ArrayList<Integer> resultList = new ArrayList<Integer>();

        TreeNode tree = new TreeNode();
        tree.value = 14;
        TreeNode leftSubtree = new TreeNode();
        leftSubtree.value = 3;
        TreeNode rightSubtree = new TreeNode();
        rightSubtree.value = 5;

        tree.left = leftSubtree;
        tree.right = rightSubtree;

        BinaryTreePreorderTraversal soln = new BinaryTreePreorderTraversal();
        resultList = soln.preorderTraversal(tree);

        System.out.println("Preorder Traversal : ");
        for(Integer value : resultList) {
            System.out.print(value+", ");
        }

    }

    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> returnList = new ArrayList<Integer>();

        if(root == null)
            return returnList;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.empty()) {
            TreeNode n = stack.pop();
            returnList.add(n.value);

            if(n.right != null) {
                stack.push(n.right);
            }

            if(n.left != null) {
                stack.push(n.left);
            }
        }
        return returnList;
    }
}
