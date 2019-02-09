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

***Day 120***

Implement the singleton pattern with a twist. First, instead of storing one instance, store two instances. And in every even call of getInstance(), return the first instance and in every odd call of getInstance(), return the second instance.

*This problem was asked by Microsoft.*

***Day 121***

Given a string which we can delete at most k, return whether you can make a palindrome.

For example, given 'waterrfetawx' and a k of 2, you could delete f and x to get 'waterretaw'.

*This problem was asked by Google.*

***Day 122***

You are given a 2-d matrix where each cell represents number of coins in that cell. Assuming we start at matrix[0][0], and can only move right or down, find the maximum number of coins you can collect by the bottom right corner.

For example, in this matrix
```
0 3 1 1
2 0 0 4
1 5 3 1
```
The most we can collect is 0 + 2 + 1 + 5 + 3 + 1 = 12 coins.

*This question was asked by Zillow.*

***Day 123***

Given a string, return whether it represents a number. Here are the different kinds of numbers:

- "10", a positive integer
- "-10", a negative integer
- "10.1", a positive real number
- "-10.1", a negative real number
- "1e5", a number in scientific notation

And here are examples of non-numbers:

- "a"
- "x 1"
- "a -2"
- "-"

*This problem was asked by LinkedIn.*

***Day 124***

You have 100 fair coins and you flip them all at the same time. Any that come up tails you set aside. The ones that come up heads you flip again. How many rounds do you expect to play before only one coin remains?

Write a function that, given n, returns the number of rounds you'd expect to play until one coin remains.

*This problem was asked by Microsoft.*

***Day 125***

Given the root of a binary search tree, and a target K, return two nodes in the tree whose sum equals K.

For example, given the following tree and K of 20
```
    10
   /   \
 5      15
       /  \
     11    15
```  
Return the nodes 5 and 15.

*This problem was asked by Google.*

***Day 126***

Write a function that rotates a list by k elements. For example, [1, 2, 3, 4, 5, 6] rotated by two becomes [3, 4, 5, 6, 1, 2]. Try solving this without creating a copy of the list. How many swap or move operations do you need?

*This problem was asked by Facebook.*

***Day 127***

Let's represent an integer in a linked list format by having each node represent a digit in the number. The nodes make up the number in reversed order.

For example, the following linked list:
``` 
1 -> 2 -> 3 -> 4 -> 5
is the number 54321.
``` 
Given two linked lists in this format, return their sum in the same linked list format.

For example, given
``` 
9 -> 9
5 -> 2
``` 
return 124 (99 + 25) as:
``` 
4 -> 2 -> 1
``` 
*This problem was asked by Microsoft.*

***Day 128***

The Tower of Hanoi is a puzzle game with three rods and n disks, each a different size.

All the disks start off on the first rod in a stack. They are ordered by size, with the largest disk on the bottom and the smallest one at the top.

The goal of this puzzle is to move all the disks from the first rod to the last rod while following these rules:

You can only move one disk at a time.
A move consists of taking the uppermost disk from one of the stacks and placing it on top of another stack.
You cannot place a larger disk on top of a smaller disk.
Write a function that prints out all the steps necessary to complete the Tower of Hanoi. You should assume that the rods are numbered, with the first rod being 1, the second (auxiliary) rod being 2, and the last (goal) rod being 3.

For example, with n = 3, we can do this in 7 moves:
``` 
Move 1 to 3
Move 1 to 2
Move 3 to 2
Move 1 to 3
Move 2 to 1
Move 2 to 3
Move 1 to 3
``` 

***Day 129***

Given a real number n, find the square root of n. For example, given n = 9, return 3.

***Day 130***

Given an array of numbers representing the stock prices of a company in chronological order and an integer k, return the maximum profit you can make from k buys and sells. You must buy the stock before you can sell it, and you must sell the stock before you can buy it again.

For example, given k = 2 and the array [5, 2, 4, 0, 1], you should return 3.

*This problem was asked by Facebook.*

***Day 131***

Given the head to a singly linked list, where each node also has a “random” pointer that points to anywhere in the linked list, deep clone the list.

*This question was asked by Snapchat.*

***Day 132***

Design and implement a HitCounter class that keeps track of requests (or hits). It should support the following operations:

- record(timestamp): records a hit that happened at timestamp
- total(): returns the total number of hits recorded
- range(lower, upper): returns the number of hits that occurred between timestamps lower and upper (inclusive)

Follow-up: What if our system has limited memory?

*This question was asked by Riot Games.*

***Day 133***

Given a node in a binary search tree, return the next bigger element, also known as the inorder successor.

For example, the inorder successor of 22 is 30.
``` 
   10
  /  \
 5    30
     /  \
   22    35
``` 

You can assume each node has a parent pointer.

*This problem was asked by Amazon.*

***Day 134***

You have a large array with most of the elements as zero.

Use a more space-efficient data structure, SparseArray, that implements the same interface:

- init(arr, size): initialize with the original large array and size.
- set(i, val): updates index at i with val.
- get(i): gets the value at index i.

*This problem was asked by Facebook.*

***Day 135***

Given a binary tree, find a minimum path sum from root to a leaf.

For example, the minimum path in this tree is [10, 5, 1, -1], which has sum 15.

``` 
  10
 /  \
5    5
 \     \
   2    1
       /
     -1
``` 

*This question was asked by Apple.*

***Day 136***

Given an N by M matrix consisting only of 1's and 0's, find the largest rectangle containing only 1's and return its area.

For example, given the following matrix:

``` 
[[1, 0, 0, 0],
 [1, 0, 1, 1],
 [1, 0, 1, 1],
 [0, 1, 0, 0]]
``` 

Return 4.

*This question was asked by Google.*

***Day 137***

Implement a bit array.

A bit array is a space efficient array that holds a value of 1 or 0 at each index.

- init(size): initialize the array with size
- set(i, val): updates index at i with val where val is either 1 or 0.
- get(i): gets the value at index i.

*This problem was asked by Amazon.*

***Day 138***

Find the minimum number of coins required to make n cents.

You can use standard American denominations, that is, 1¢, 5¢, 10¢, and 25¢.

For example, given n = 16, return 3 since we can make it with a 10¢, a 5¢, and a 1¢

*This problem was asked by Google.*

***Day 139***



Given an iterator with methods next() and hasNext(), create a wrapper iterator, PeekableInterface, which also implements peek(). peek shows the next element that would be returned on next().

Here is the interface:
``` 
class PeekableInterface(object):
    def __init__(self, iterator):
        pass

    def peek(self):
        pass

    def next(self):
        pass

    def hasNext(self):
        pass
``` 

*This problem was asked by Google.*

***Day 140***

Given an array of integers in which two elements appear exactly once and all other elements appear exactly twice, find the two elements that appear only once.

For example, given the array [2, 4, 6, 8, 10, 2, 6, 10], return 4 and 8. The order does not matter.

Follow-up: Can you do this in linear time and constant space?

*This problem was asked by Facebook.*
