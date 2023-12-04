package com.ibrahimatay;

import java.util.Objects;

public class Problem20 {
    /*
    Given two singly linked lists that intersect at some point, find the intersecting node.
    The lists are non-cyclical.

    For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.

    In this example, assume nodes with the same value are the exact same node objects.

    Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.
    * */

    public Node findInterSection(Node node1, Node node2) throws CloneNotSupportedException {
        if(node1 == null)return null;
        if(node2 == null)return null;

        Node node1Copy = (Node) node1.clone();
        Node node2Copy = (Node) node2.clone();

        while(node1Copy != node2Copy){
            if (node1Copy!=null){
                node1Copy = node1Copy.next;
            }else {
                node1Copy = node2;
            }

            if (node2Copy!=null){
                node2Copy = node2Copy.next;
            }else {
                node2Copy = node1;
            }
        }

        return node1Copy;
    }
}

class Node implements Cloneable{

    public int value;
    public Node next;

    public Node(int value, Node next){
        this.next = next;
        this.value = value;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return value == node.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}


