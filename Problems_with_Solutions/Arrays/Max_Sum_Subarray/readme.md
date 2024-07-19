# Maximum Sum Subarray Problem
![LinkedIn Badge](https://img.shields.io/badge/LinkedIn-0A66C2?logo=linkedin&logoColor=fff&style=flat)
![Amazon Badge](https://img.shields.io/badge/Amazon-F90?logo=amazon&logoColor=fff&style=flat)
![Apple Badge](https://img.shields.io/badge/Apple-000?logo=apple&logoColor=fff&style=flat)
![Microsoft Badge](https://img.shields.io/badge/Microsoft-5E5E5E?logo=microsoft&logoColor=fff&style=flat)
![Adobe Badge](https://img.shields.io/badge/Adobe-F00?logo=adobe&logoColor=fff&style=flat)
![Google Badge](https://img.shields.io/badge/Google-4285F4?logo=google&logoColor=fff&style=flat)
![Cisco Badge](https://img.shields.io/badge/Cisco-1BA0D7?logo=cisco&logoColor=fff&style=flat)
![Uber Badge](https://img.shields.io/badge/Uber-000?logo=uber&logoColor=fff&style=flat)
![Oracle Badge](https://img.shields.io/badge/Oracle-F80000?logo=oracle&logoColor=fff&style=flat)
![Samsung Badge](https://img.shields.io/badge/Samsung-1428A0?logo=samsung&logoColor=fff&style=flat)
![Facebook Badge](https://img.shields.io/badge/Facebook-0866FF?logo=facebook&logoColor=fff&style=flat)
## Problem Statement
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
## Solutions
- Python
    * **<a href='max_sum_bruteforce_ncube.py'>Brute Force - O(n<sup>3</sup>)</a>**
    * **<a href='max_sum_nsquare.py'>Slightly better than brute force - O(n<sup>2</sup>)</a>**
    * **<a href='max_sum_dividenconquer_nlogn.py'>Divide and Conquer Technique - O(nlogn)</a>**
    * **<a href='max_sum_dividenconquer_nlogn_memeff.py'>Divide and Conquer Technique (Memory Efficient) - O(nlogn)</a>**
    * **<a href='max_sum_kadane_n.py'>Kadane's Algorithm - O(n)</a>**
  
## Follow Up Questions
### Question 1
Return the position of the subarray in that array.
Test Case 1:
```
Input: [-2,1,-3,4,-1,2,1,-5,4]
Output: 3 6
```
Explanation: The subarray [4,-1,2,1] has the largest sum 6. It starts at index 3 and ends at index 6.

### Solutions
- Python
    * **<a href="max_sum_followup1_kadanes_slidingwindow_n.py">Kadane's Sliding Window - O(n)</a>** 