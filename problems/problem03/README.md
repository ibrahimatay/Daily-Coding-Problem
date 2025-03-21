# Daily Coding Problem

****Note***: Continuous improvements and bug fixes are made within the repository to produce better solutions.*

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

[Solution](main.go) | [Tests](main_test.go)