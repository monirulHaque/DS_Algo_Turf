# Assugming there is exactly one result.
def max_sum_subarray_followup1(arr):
    n = len(arr)
    max_sum = arr[0]
    cur_sum = 0
    L = 0
    maxL, maxR = 0, 0 
    for R in range(n):
        if cur_sum < 0:
            cur_sum = 0
            L = R
        cur_sum += arr[R] 
        if cur_sum > max_sum:
            max_sum = cur_sum
            maxL, maxR = L, R
    return maxL, maxR
