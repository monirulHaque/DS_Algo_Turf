# Question
Given two arrays X[] and Y[] of size M and N respectively. Find number of pairs such that xy > yx where x is an element from X[] and y is an element from Y[].

### Example 1:

#### Input:
M = 3 <br />
N = 2 <br />
X[] = {2, 1, 6} <br />
Y[] = {1, 5}
#### Output: 
3
#### Explanation: 
There are total 3 pairs 
where pow(x, y) is greater than pow(y, x) 
Pairs are (2, 1), (2, 5) and (6, 1).

### Example 2:

#### Input:
M = 3 <br />
N = 3 <br />
X[] = {10, 19, 18} <br /> 
Y[] = {11, 15, 9}
#### Output:
 2
#### Explanation:
There are total 2 pairs <br />
where pow(x, y) is greater than pow(y, x) <br />
Pairs are (10, 11) and (10, 15).

### Your Task:
You don't need to read input or print anything. Your task is to complete the function countPairs() which takes array X[], array Y[], m and n as input parameters and returns an integer denoting the number of pairs that are true to the given condition. 


Expected Time Complexity: O(N*logN + M*logM) <br />
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ M, N ≤ 105 <br />
1 ≤ X\[i\] <br />
Y\[i\] ≤ 103


 