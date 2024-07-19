def max_sum_subarray(arr):
    n = len(arr)
    max_sum = arr[0]
    cur_sum = 0
    for i in range(n):
        cur_sum = max(cur_sum, 0)
        cur_sum += arr[i] 
        max_sum = max(max_sum, cur_sum)
    return max_sum