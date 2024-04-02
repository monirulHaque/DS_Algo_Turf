def max_sum_subarray(arr):
    n = len(arr)
    max_sum = 0
    for i in range(n):
        sum = 0
        for j in range(i, n):
            sum += arr[j]    
            max_sum = max(max_sum, sum)
    return max_sum
    