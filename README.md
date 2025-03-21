# Daily Coding Problem
My solutions to coding challenges from dailycodingproblem.com are implemented in Go. If you have any questions or suggestions, please feel free to open a new issue thread for discussion.

****Note***: Continuous improvements and bug fixes are made within the repository to produce better solutions.*

***Day 25***

Implement regular expression matching with the following special characters:
- . (period) which matches any single character
- * (asterisk) which matches zero or more of the preceding element

That is, implement a function that takes in a string and a valid regular
expression and returns whether or not the string matches the regular expression.

For example, given the regular expression "ra." and the string "ray", your
function should return true. The same regular expression on the string "raymond"
should return false.

Given the regular expression ".*at" and the string "chat", your function should
return true. The same regular expression on the string "chats" should return false.

*This problem was asked by Facebook.*

**_[Solution & Test](/problems/problem25)_**

***Day 24***

Implement locking in a binary tree. A binary tree node can be locked or unlocked
only if all of its descendants or ancestors are not locked.

Design a binary tree node class with the following methods:

- is_locked, which returns whether the node is locked
- lock, which attempts to lock the node. If it cannot be locked, then it should return false. Otherwise, it should lock it and return true.
- unlock, which unlocks the node. If it cannot be unlocked, then it should return
false. Otherwise, it should unlock it and return true.

You may augment the node to add parent pointers or any other property you would
like. You may assume the class is used in a single-threaded program, so there is
no need for actual locks or mutexes. Each method should run in O(h), where h is
the height of the tree.

*This problem was asked by Google.*

**_[Solution & Test](/problems/problem24)_**

***Day 23***

You are given an M by N matrix consisting of booleans that represents a board.
Each True boolean represents a wall. Each False boolean represents a tile you
can walk on.

Given this matrix, a start coordinate, and an end coordinate, return the minimum
number of steps required to reach the end coordinate from the start. If there is
no possible path, then return null. You can move up, left, down, and right. You
cannot move through walls. You cannot wrap around the edges of the board.

For example, given the following board:
```
[[f, f, f, f],
[t, t, f, t],
[f, f, f, f],
[f, f, f, f]]
```
and start = (3, 0) (bottom left) and end = (0, 0) (top left), the minimum number
of steps required to reach the end is 7, since we would need to go through (1, 2)
because there is a wall everywhere else on the second row.

*This problem was asked by Google.*

**_[Solution & Test](/problems/problem23)_**

***Day 22***

Given a dictionary of words and a string made up of those words (no spaces), return the original sentence in a list. If there is more than one possible reconstruction, return any of them. If there is no possible reconstruction, then return null.

For example, given the set of words 'quick', 'brown', 'the', 'fox', and the string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].

Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the string "bedbathandbeyond", return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond'].

*This problem was asked by Microsoft.*

**_[Solution & Test](/problems/problem22)_**

***Day 21***

Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.
For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.

*This problem was asked by Snapchat.*

**_[Solution & Test](/problems/problem21)_**

***Day 20***

Given two singly linked lists that intersect at some point, find the intersecting node. The lists are non-cyclical.

For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.

In this example, assume nodes with the same value are the exact same node objects.

Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.

*This problem was asked by Google.*

**_[Solution & Test](/problems/problem20)_**

***Day 19***

A builder is looking to build a row of N houses that can be of K different colors. He has a goal of minimizing cost while ensuring that no two neighboring houses are of the same color.

Given an N by K matrix where the nth row and kth column represents the cost to build the nth house with kth color, return the minimum cost which achieves this goal.

*This problem was asked by Facebook.*

**_[Solution & Test](/problems/problem19)_**

***Day 18***

Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.

For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:
```
10 = max(10, 5, 2)
7 = max(5, 2, 7)
8 = max(2, 7, 8)
8 = max(7, 8, 7)
```
Do this in O(n) time and O(k) space. You can modify the input array in-place and you do not need to store the results. You can simply print them out as you compute them.

*This problem was asked by Google.*

**_[Solution & Test](/problems/problem18)_**

***Day 17***

Suppose we represent our file system by a string in the following manner:
The string "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" represents:
```
dir
subdir1
subdir2
file.ext
```
The directory dir contains an empty sub-directory subdir1 and a sub-directory subdir2 containing a file file.ext.
The string "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext" represents:
```
dir
subdir1
file1.ext
subsubdir1
subdir2
subsubdir2
file2.ext
```
The directory dir contains two sub-directories subdir1 and subdir2. subdir1 contains a file file1.ext and an empty second-level sub-directory subsubdir1. subdir2 contains a second-level sub-directory subsubdir2 containing a file file2.ext.
We are interested in finding the longest (number of characters) absolute path to a file within our file system. For example, in the second example above, the longest absolute path is "dir/subdir2/subsubdir2/file2.ext", and its length is 32 (not including the double quotes).

Given a string representing the file system in the above format, return the length of the longest absolute path to a file in the abstracted file system. If there is no file in the system, return 0.
Note:
The name of a file contains at least a period and an extension.
The name of a directory or sub-directory will not contain a period.

*This problem was asked by Google.*

**_[Solution & Test](/problems/problem17)_**

***Day 16***

You run an e-commerce website and want to record the last N order ids in a log. Implement a data structure to accomplish this, with the following API:

record(order_id): adds the order_id to the log get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N. You should be as efficient with time and space as possible.

*This problem was asked by Twitter.*

**_[Solution & Test](/problems/problem16)_**

***Day 15***

Given a stream of elements too large to store in memory, pick a random element from the stream with uniform probability.

If you liked this problem, feel free to forward it along!

*This problem was asked by Facebook.*

**_[Solution & Test](/problems/problem15)_**

***Day 14***

The area of a circle is defined as πr2. Estimate π to 3 decimal places using a Monte Carlo method.

Hint: The basic equation of a circle is x2 + y2 = r2.

*This problem was asked by Google.*

**_[Solution & Test](/problems/problem14)_**

***Day 13***

Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.

For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb", so your function should return 3.

*This problem was asked by Amazon.*

**_[Solution & Test](/problems/problem13)_**

***Day 12***

There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.
For example, if N is 4, then there are 5 unique ways:
```
1, 1, 1, 1
2, 1, 1
1, 2, 1
1, 1, 2
2, 2
```

What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? 

For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time.

*This problem was asked by Apple.*

**_[Solution & Test](/problems/problem12)_**

***Day 11***

Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.

For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].

Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.

*This problem was asked by Twitter.*

**_[Solution & Test](/problems/problem11)_**

***Day 10***

Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.

*This problem was asked by Apple.*

**_[Solution & Test](/problems/problem10)_**

***Day 9***

Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.

*This problem was asked by Airbnb.*

**_[Solution & Test](/problems/problem09)_**

***Day 8***

A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

Given the root to a binary tree, count the number of unival subtrees.

For example, the following tree has 5 unival subtrees:
```
   0
  / \
 1   0
    / \
   1   0
  / \
 1   1
```

*This problem was asked by Google.*

**_[Solution & Test](/problems/problem08)_**

***Day 7***

Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed.

*This problem was asked by Facebook.*

**_[Solution & Test](/problems/problem07)_**

***Day 6***

An XOR linked list is a more memory efficient doubly linked list. Instead of each node holding next and prev fields, it holds a field named both, which is an XOR of the next node and the previous node. Implement an XOR linked list; it has an add(element) which adds the element to the end, and a get(index) which returns the node at index.

If using a language that has no pointers (such as Python), you can assume you have access to ```get_pointer ``` and ```dereference_pointer``` functions that converts between nodes and memory addresses.

*This problem was asked by Google.*

**_[Solution & Test](/problems/problem06)_**

***Day 5***

cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4. Given this implementation of cons:
```
  def cons(a, b):
    def pair(f):
      return f(a, b)
    return pair
```
Implement car and cdr.

*This problem was asked by Jane Street.*

**_[Solution & Test](/problems/problem05)_**

***Day 4***

Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well. For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3. You can modify the input array in-place.

*This problem was asked by Stripe.*

**_[Solution & Test](/problems/problem04)_**

***Day 3***

Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree. For example, given the following Node class
```
class Node:
  def __init__(self, val, left=None, right=None):
    self.val = val
    self.left = left
    self.right = right
```
The following test should pass:
```
  node = Node('root', Node('left', Node('left.left')), Node('right'))
  assert deserialize(serialize(node)).left.left.val == 'left.left'
```
*This problem was asked by Google.*

**_[Solution & Test](/problems/problem03)_**

***Day 2***

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i. For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

*This problem was asked by Uber.*

**_[Solution & Test](/problems/problem02)_**

***Day 1***

Given a list of numbers and a number k, return whether any two numbers from the list add up to k. For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

*This problem was recently asked by Google.*

**_[Solution & Test](/problems/problem01)_**