# My Target Problems of The Second 100

***Day 101***

Given an even number (greater than 2), return two prime numbers whose sum will be equal to the given number.

A solution will always exist. See [Goldbach’s conjecture.](https://en.wikipedia.org/wiki/Goldbach%27s_conjecture)

Example:
```
Input: 4
Output: 2 + 2 = 4
```
If there are more than one solution possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b, and [c, d] is another solution with c <= d, then
```
[a, b] < [c, d]
If a < c OR a==c AND b < d.
```

*This problem was asked by Alibaba.*

***Day 102***

Given a list of integers and a number K, return which contiguous elements of the list sum to K.

For example, if the list is [1, 2, 3, 4, 5] and K is 9, then it should return [2, 3, 4].

*This problem was asked by Lyft.*

***Day 103***

Given a string and a set of characters, return the shortest substring containing all the characters in the set.

For example, given the string "figehaeci" and the set of characters {a, e, i}, you should return "aeci".

If there is no substring containing all the characters in the set, return null.

*This problem was asked by Square.*

***Day 104***

Determine whether a doubly linked list is a palindrome. What if it’s singly linked?

For example, 1 -> 4 -> 3 -> 4 -> 1 returns true while 1 -> 4 returns false.

*This problem was asked by Google.*

***Day 105***

Given a function f, and N return a debounced f of N milliseconds.

That is, as long as the debounced f continues to be invoked, f itself will not be called for N milliseconds.

*This problem was asked by Facebook.*

***Day 106***

Given an integer list where each number represents the number of hops you can make, determine whether you can reach to the last index starting at index 0.

For example, [2, 0, 1, 0] returns true while [1, 1, 0, 1] returns false.

*This problem was asked by Pinterest.*

***Day 107***

Print the nodes in a binary tree level-wise. For example, the following should print 1, 2, 3, 4, 5.
```
  1
 / \
2   3
   / \
  4   5
```

*This problem was asked by Microsoft.*

***Day 108***

Given two strings A and B, return whether or not A can be shifted some number of times to get B.

For example, if A is abcde and B is cdeab, return true. If A is abc and B is acb, return false.

*This problem was asked by Google.*

***Day 109***

Given an unsigned 8-bit integer, swap its even and odd bits. The 1st and 2nd bit should be swapped, the 3rd and 4th bit should be swapped, and so on.

For example, 10101010 should be 01010101. 11100010 should be 11010001.

Bonus: Can you do this in one line?

*This problem was asked by Cisco.*

***Day 110***

Given a binary tree, return all paths from the root to leaves.

For example, given the tree
```
   1
  / \
 2   3
    / \
   4   5
```
it should return [[1, 2], [1, 3, 4], [1, 3, 5]].

*This problem was asked by Facebook.*

***Day 111***

Given a word W and a string S, find all starting indices in S which are anagrams of W.

For example, given that W is "ab", and S is "abxaba", return 0, 3, and 4.

*This problem was asked by Google.*

***Day 112***

Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree. Assume that each node in the tree also has a pointer to its parent.

According to the definition of [LCA on Wikipedia](https://www.wikiwand.com/en/Lowest_common_ancestor): “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

*This problem was asked by Twitter.*

***Day 113***

Given a string of words delimited by spaces, reverse the words in string. For example, given "hello world here", return "here world hello"

Follow-up: given a mutable string representation, can you perform this operation in-place?

*This problem was asked by Google.*

***Day 114***

Given a string and a set of delimiters, reverse the words in the string while maintaining the relative order of the delimiters. For example, given "hello/world:here", return "here/world:hello"

Follow-up: Does your solution work for the following cases: "hello/world:here/", "hello//world:here"

*This problem was asked by Facebook.*

***Day 115***

Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.

*This problem was asked by Google.*

***Day 116***

Generate a finite, but an arbitrarily large binary tree quickly in O(1).

That is, generate() should return a tree whose size is unbounded but finite.

*This problem was asked by Jane Street.*

***Day 117***

Given a binary tree, return the level of the tree with minimum sum.

*This problem was asked by Facebook.*

***Day 118***

Given a sorted list of integers, square the elements and give the output in sorted order.

For example, given [-9, -2, 0, 2, 3], return [0, 4, 4, 9, 81].

*This problem was asked by Google.*

***Day 119***

Given a set of closed intervals, find the smallest set of numbers that covers all the intervals. If there are multiple smallest sets, return any of them.

For example, given the intervals [0, 3], [2, 6], [3, 4], [6, 9], one set of numbers that covers all these intervals is {3, 6}.

*This problem was asked by Google.*
