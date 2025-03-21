# Daily Coding Problem

****Note***: Continuous improvements and bug fixes are made within the repository to produce better solutions.*

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

[Solution](main.go) | [Tests](main_test.go)