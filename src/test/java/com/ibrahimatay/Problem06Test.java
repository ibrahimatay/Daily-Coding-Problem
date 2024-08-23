package com.ibrahimatay;

import org.junit.*;

import static org.junit.Assert.*;

public class Problem05Test {

    /*
    An XOR linked list is a more memory efficient doubly linked list. Instead of each node holding next and prev fields, it holds a field named both, which is an XOR of the next node and the previous node. Implement an XOR linked list; it has an add(element) which adds the element to the end, and a get(index) which returns the node at index.

    If using a language that has no pointers (such as Python), you can assume you have access to get_pointer  and dereference_pointer functions that converts between nodes and memory addresses.

    This problem was asked by Google.
    */

    private Problem06 problem;

    @Before
    public void setUp() {
        problem = new Problem06();
    }

    @Test
    public void testAddAndGetSingleElement() {
        problem.add(10);
        assertEquals(10, problem.get(0), "The first element should be 10");
    }

    @Test
    public void testAddMultipleElements() {
        problem.add(10);
        problem.add(20);
        problem.add(30);
        problem.add(40);

        assertEquals(10, problem.get(0), "The first element should be 10");
        assertEquals(20, problem.get(1), "The second element should be 20");
        assertEquals(30, problem.get(2), "The third element should be 30");
        assertEquals(40, problem.get(3), "The fourth element should be 40");
    }

    @Test
    public void testGetWithInvalidIndex() {
        problem.add(10);
        problem.add(20);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            problem.get(3);
        }, "Getting an element at an invalid index should throw IndexOutOfBoundsException");
    }

    @Test
    public void testAddAndRetrieveSequentially() {
        for (int i = 0; i < 1000; i++) {
            problem.add(i);
        }

        for (int i = 0; i < 1000; i++) {
            assertEquals(i, problem.get(i), "Element at index " + i + " should be " + i);
        }
    }
}