package com.ibrahimatay;

import com.ibrahimatay.Problem03.*;
import org.junit.*;
import static org.junit.Assert.*;

public class Problem03Test {

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

    private Problem03 problem;

    @Before
    public void setUp() throws Exception {
        problem = new Problem03();

    }

    @Test
    public void shouldBeInputValue1DependsOnOutputValueIsThatForSerialize(){
        Node node = new Node("root",
                        new Node("left",
                                new Node("left.left"), null), new Node("right"));

        var result = problem.serialize(node);

        assertEquals("root,left,right,left.left,#,#,#,#,#", result);
    }

    @Test
    public void shouldBeInputValue2DependsOnOutputValueIsThatForSerialize(){
        Node node = new Node("root", null, new Node("right"));

        var result = problem.serialize(node);

        assertEquals("root,#,right,#,#", result);
    }

    @Test
    public void shouldBeInputValue1DependsOnOutputValueIsThatForDeserialize(){

        Node node = problem.deserialize("root,left,right,left.left,#,#,#,#,#");

        assertEquals("root", node.value);
        assertEquals("right", node.getRight().value);
        assertEquals("left", node.getLeft().value);
        assertEquals("left.left", node.getLeft().getLeft().value);
    }

    @Test
    public void shouldBeInputValue2DependsOnOutputValueIsThatForDeserialize(){

        Node node = problem.deserialize("root,#,right,#,#");

        assertEquals("root", node.value);
        assertEquals(null, node.getLeft());
        assertEquals("right", node.getRight().value);

    }
}