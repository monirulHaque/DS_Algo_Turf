# One Edit Distance
## Problem Statement
Given two strings S and T, determine if they are both one edit distance apart.

Test Case 1:
```
Input: "pale", "ple"
Output: True
```

Test Case 2:
```
Input: "pale", "bale"
Output: True
```

Test Case 3:
```
Input: "pale", "bake"
Output: False
```

### Hints
- If | n – m | is greater than 1, we know immediately both are not one-edit distance 
apart.
- It might help if we consider these cases separately, m == n and m ≠ n.
- Assume that m is always ≤ n, which greatly simplifies the conditional statements. 
If m > n, we could just simply swap S and T.
- If m == n, it becomes finding if there is exactly one modified operation. If m ≠ n, we do not have to consider the delete operation. Just consider the insert operation 
in T

#### Solutions
- Python
    * **<a href="oneEditAway.py">Simple Solution - O(n)</a>** (space: O(1))