# Maximum Sum Subarray Problem
Given an array of integers, find the contiguous subarray which has the largest sum and return its sum.

Test Case 1:
```
Input: [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
```
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Test Case 2:
```
Input: [1]
Output: 1
```
Test Case 3:
```
Input: [-2,-1]
Output: 0
```
Solutions:
- Python
    * **<a href='max_sum_bruteforce_ncube.py'>Brute Force - O(n<sup>3</sup>)</a>**
    * **<a href='max_sum_nsquare.py'>Slightly better than brute force - O(n<sup>2</sup>)</a>**
    * **<a href='max_sum_dividenconquer_nlogn.py'>Divide and Conquer Technique - O(nlogn)**
    * **<a href='max_sum_dividenconquer_nlogn_memeff.py'>Divide and Conquer Technique (Memory Efficient) - O(nlogn)**
    * **<a href='max_sum_kadane_n.py'>Kadane's Algorithm - O(n)**