package com.ibrahimatay;

import java.util.LinkedList;
import java.util.Queue;

public class Problem24 {
    /*
     * Implement locking in a binary tree. A binary tree node can be locked or
     * unlocked only if all of its descendants or ancestors are not locked.
     * 
     * Design a binary tree node class with the following methods:
     * 
     * is_locked, which returns whether the node is locked
     * lock, which attempts to lock the node. If it cannot be locked, then it should
     * return false. Otherwise, it should lock it and return true.
     * unlock, which unlocks the node. If it cannot be unlocked, then it should
     * return false. Otherwise, it should unlock it and return true.
     * You may augment the node to add parent pointers or any other property you
     * would like. You may assume the class is used in a single-threaded program, so
     * there is no need for actual locks or mutexes. Each method should run in O(h),
     * where h is the height of the tree.
     * 
     * This problem was asked by Google.
     */

    class BinaryTreeNode {
        private BinaryTreeNode left;
        private BinaryTreeNode right;
        private BinaryTreeNode parent;
        private boolean isLocked;
        private int lockedDescendantsCount; 

        public BinaryTreeNode(BinaryTreeNode parent) {
            this.parent = parent;
            this.isLocked = false;
            this.lockedDescendantsCount = 0;
        }

        public boolean isLocked() {
            return isLocked;
        }

        public boolean lock() {
            if (isLocked || lockedDescendantsCount > 0) {
                return false;
            }

            if (hasLockedAncestors()) {
                return false;
            }

            isLocked = true;

            BinaryTreeNode current = parent;
            while (current != null) {
                current.lockedDescendantsCount++;
                current = current.parent;
            }

            return true;
        }

        public boolean unlock() {
            if (!isLocked) {
                return false;
            }

            isLocked = false;

            BinaryTreeNode current = parent;
            while (current != null) {
                current.lockedDescendantsCount--;
                current = current.parent;
            }

            return true;
        }

        private boolean hasLockedAncestors() {
            BinaryTreeNode current = parent;
            while (current != null) {
                if (current.isLocked) {
                    return true;
                }
                current = current.parent;
            }
            return false;
        }

        public void setLeft(BinaryTreeNode left) {
            this.left = left;
        }

        public void setRight(BinaryTreeNode right) {
            this.right = right;
        }

        public BinaryTreeNode getLeft() {
            return left;
        }

        public BinaryTreeNode getRight() {
            return right;
        }
    }

}
