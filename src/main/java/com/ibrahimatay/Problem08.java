package com.ibrahimatay;

public class Problem08 {

    /*
    *
    * This problem was asked by Google.

    A unival tree (which stands for "universal value") is a tree where all nodes under
    it have the same value.

    Given the root to a binary tree, count the number of unival subtrees.

    For example, the following tree has 5 unival subtrees:

       0
      / \
     1   0
        / \
       1   0
      / \
     1   1
    * */


    public int solution(Node node){
        return getUnivalCount(node);
    }

    private int getUnivalCount(Node node){
        if (node == null)return 0;

        int count = getUnivalCount(node.left) + getUnivalCount(node.right);
        if(isUnivalTree(node)){
            count++;
        }

        return count;
    }

    private boolean isUnivalTree(Node node){
        if(node == null)return true;

        if(node.left !=null && node.left.value == node.value)return true;
        if(node.right !=null && node.right.value == node.value)return false;
        if(isUnivalTree(node.left) && isUnivalTree(node.right))return true;

        return false;
    }

    public static class Node {
        public int value;
        public Node left;
        public Node right;
    }
}
