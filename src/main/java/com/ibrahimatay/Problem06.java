package com.ibrahimatay;

import java.util.HashMap;

public class Problem05 {
    
    /*
    An XOR linked list is a more memory efficient doubly linked list. Instead of each node holding next and prev fields, it holds a field named both, which is an XOR of the next node and the previous node. Implement an XOR linked list; it has an add(element) which adds the element to the end, and a get(index) which returns the node at index.

    If using a language that has no pointers (such as Python), you can assume you have access to get_pointer  and dereference_pointer functions that converts between nodes and memory addresses.

    This problem was asked by Google.
    */

    private class Node {
        int data;
        int both;

        Node(int data) {
            this.data = data;
            this.both = 0;
        }
    }

    private HashMap<Integer, Node> memory;
    private int head;
    private int tail;
    private int idCounter;

    public Problem05() {
        memory = new HashMap<>();
        head = -1;
        tail = -1;
        idCounter = 0;
    }

    private int getPointer(Node node) {
        if (node == null) {
            return 0;
        }

        int address = idCounter++;
        memory.put(address, node);
        
        return address;
    }

    private Node dereferencePointer(int address) {
        return memory.get(address);
    }

    public void add(int element) {
        Node newNode = new Node(element);

        if (head == -1) {
            head = getPointer(newNode);
            tail = head;
        } else {
            Node tailNode = dereferencePointer(tail);
            newNode.both = tail; 
            tailNode.both ^= getPointer(newNode); 
            tail = getPointer(newNode); 
        }
    }

    public int get(int index) {
        int current = head;
        int prev = 0;
        int next;

        for (int i = 0; i < index; i++) {
            Node currentNode = dereferencePointer(current);
            next = prev ^ currentNode.both;

            prev = current;
            current = next;

            if (current == 0) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
        }

        return dereferencePointer(current).data;
    }
}