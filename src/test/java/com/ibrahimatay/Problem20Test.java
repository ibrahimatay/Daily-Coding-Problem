package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Problem20Test {
    /*
    Given two singly linked lists that intersect at some point, find the intersecting node.
    The lists are non-cyclical.

    For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.

    In this example, assume nodes with the same value are the exact same node objects.

    Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.
    * */

    private Problem20 problem;

    @Before
    public void setUp() {
        problem = new Problem20();
    }

    @Test
    public void Test01() throws CloneNotSupportedException {
        Node common_tail = new Node(8, new Node(10, null));
        Node l1 = new Node(1, new Node(2, new Node(3, new Node(7, common_tail))));
        Node l2 = new Node(99, new Node(1, common_tail));

        assertNotNull(problem.findInterSection(l1, l2));
    }
}
