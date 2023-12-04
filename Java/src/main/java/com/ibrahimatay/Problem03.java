package com.ibrahimatay;

import java.util.LinkedList;

public class Problem03 {
    /*
    This problem was asked by Google.

    Given the root to a binary tree, implement serialize(root),
    which serializes the tree into a string, and deserialize(s),
    which deserializes the string back into the tree.

    For example, given the following Node class

    class Node:
        def __init__(self, val, left=None, right=None):
            self.val = val
            self.left = left
            self.right = right
    The following test should pass:

    node = Node('root', Node('left', Node('left.left')), Node('right'))
    assert deserialize(serialize(node)).left.left.val == 'left.left'
    */

    public String serialize(Node node){

        if(node==null)return "";

        StringBuilder builder = new StringBuilder();

        LinkedList<Node> queue = new LinkedList<>();

        queue.add(node);

        while (!queue.isEmpty()){
            Node currentNode = queue.poll();
            if(currentNode!=null){
                builder.append(String.valueOf(currentNode.value)+",");
                queue.add(currentNode.getLeft());
                queue.add(currentNode.getRight());
            }else {
                builder.append("#,");
            }
        }

        builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }

    public Node deserialize(String value){

        if(value.isEmpty())return null;

        var queue = new LinkedList<Node>();
        String[] inputs = value.split(",");

        var root = new Node(inputs[0]);
        queue.offer(root);
        int index = 1;

        while (!queue.isEmpty() ){
            Node currentNode = queue.poll();

            if(currentNode==null)continue;

            if(!inputs[index].equals("#")){
                currentNode.setLeft(new Node(inputs[index]));
                queue.offer(currentNode.getLeft());
            }else {
                currentNode.setLeft(null);
                queue.offer(null);
            }

            index++;

            if(!inputs[index].equals("#")){
                currentNode.setRight(new Node(inputs[index]));
                queue.offer(currentNode.getRight());
            }else {
                currentNode.setRight(null);
                queue.offer(null);
            }

            index++;
        }

        return root;
    }


    public static class Node {

        public final String value;
        private Node left;
        private Node right;

        public Node(String value){
            this.value = value;
            this.setLeft(null);
            this.setRight(null);
        }

        public Node(String value, Node left, Node right){
            this.value = value;
            this.setLeft(left);
            this.setRight(right);
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
