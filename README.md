# DailyCodingProblem
Daily coding problem questions solved using Java

***Day 1***

Given a list of numbers and a number k, return whether any two numbers from the list add up to k. For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

*This problem was recently asked by Google.*

[[Solution](https://github.com/ibrahimatay/DailyCodingProblem/blob/master/src/main/java/com/ibrahimatay/Problem01.java)]
[[Test](https://github.com/ibrahimatay/DailyCodingProblem/blob/master/src/test/java/com/ibrahimatay/Problem01Test.java)]

***Day 2***

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i. For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

*This problem was asked by Uber.*

[[Solution](https://github.com/ibrahimatay/DailyCodingProblem/blob/master/src/main/java/com/ibrahimatay/Problem02.java)]
[[Test](https://github.com/ibrahimatay/DailyCodingProblem/blob/master/src/test/java/com/ibrahimatay/Problem02Test.java)]

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

[[Solution](https://github.com/ibrahimatay/DailyCodingProblem/blob/master/src/main/java/com/ibrahimatay/Problem03.java)]
[[Test](https://github.com/ibrahimatay/DailyCodingProblem/blob/master/src/test/java/com/ibrahimatay/Problem03Test.java)]

***Day 4***

Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well. For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3. You can modify the input array in-place.

*This problem was asked by Stripe.*

[[Solution](https://github.com/ibrahimatay/DailyCodingProblem/blob/master/src/main/java/com/ibrahimatay/Problem04.java)]
[[Test](https://github.com/ibrahimatay/DailyCodingProblem/blob/master/src/test/java/com/ibrahimatay/Problem04Test.java)]

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

[[Solution](https://github.com/ibrahimatay/DailyCodingProblem/blob/master/src/main/java/com/ibrahimatay/Problem05.java)]
[[Test](https://github.com/ibrahimatay/DailyCodingProblem/blob/master/src/test/java/com/ibrahimatay/Problem05Test.java)]



