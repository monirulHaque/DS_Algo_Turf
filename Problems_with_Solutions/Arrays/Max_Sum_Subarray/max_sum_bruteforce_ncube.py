def max_sum_subarray(arr):
    n = len(arr)
    for i in range(n):
        for j in range(i, n):
            sum = 0
            for k in range(i, j):
                sum += arr[k]
            max_sum = max(max_sum, sum)
    return max_sum
    