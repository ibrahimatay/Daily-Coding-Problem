package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem08Test {

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


    private Problem08 problem;

    @Before
    public void setUp() {
        problem = new Problem08();
    }

    @Test
    public void shouldBeGivenTheUnivalNull(){
        assertEquals(0, problem.solution(null));
    }

    @Test
    public void shouldBeGivenTheUnival1(){

        Problem08.Node root = new Problem08.Node();
        root.value = 0;

        root.right = new Problem08.Node();
        root.right.value = 1;

        root.left = new Problem08.Node();
        root.left.value = 1;

        assertEquals(3, problem.solution(root));
    }

    @Test
    public void shouldBeGivenTheUnival5(){

        Problem08.Node root = new Problem08.Node();
        root.value = 0;

        root.right = new Problem08.Node();
        root.right.value = 1;

        root.left = new Problem08.Node();
        root.left.value = 0;

        root.left.left = new Problem08.Node();
        root.left.left.value = 0;

        root.left.right = new Problem08.Node();
        root.left.right.value = 1;

        root.left.right.right = new Problem08.Node();
        root.left.right.right.value = 1;

        root.left.right.left = new Problem08.Node();
        root.left.right.left.value = 1;

        assertEquals(7, problem.solution(root));
    }
}
