# Two Sum
## Problem Statement
Given an array of integers, find two numbers such that they add up to a specific target number.


Test Case 1:
```
Input: [3,5,-4,8,11,1,-1,6], 10
Output: 4, 6
```

### Solutions
- Python
    * **<a href='twoSum_bruteforce_nsquare.py'>Brute Force - O(n<sup>2</sup>)</a>** (space: O(1))
    * **<a href='twoSum_hashing_n.py'>Hashing - O(n)</a>** (space: O(n))
## Follow Up Questions
### Question 1
What if the given array is sorted in ascending order?
Test Case 1:
```
Input: [-4, -1, 1, 3, 5, 6, 8, 11], 10
Output: 1, 7
```
#### Solutions
- Python
    * **<a href='twoSum_followup1_BinarySearch_nlogn.py'>Binary Search - O(nlogn)</a>** (space: O(1))
    * **<a href='twoSum_followup1_TwoPointers_n.py'>Two Pointers - O(n)</a>** (space: O(1); If the sorting took place in the function, time complexity would have been O(nlogn))
### Question 2
Design and implement a TwoSum class. It should support the following operations: add
and find.
add(input) – Add the number input to an internal data structure.
find(value) – Find if there exists any pair of numbers which sum is equal to the value.
For example,
add(1); add(3); add(5); find(4) -> true; find(7) -> false
#### Solutions
- Python 
    * **<a href='twoSum_followup2_hashtable_pairsums.py'>Pair sums in HashTable</a>** (add – O(n), find – O(1), space: O(n<sup>2</sup>) )