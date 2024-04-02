
def mid_cross_sum(arr, mid):
    sum = 0
    leftsum = -float('inf')
    for i in range(mid-1, 0, -1):
        sum += arr[i]
        if sum > leftsum: leftsum = sum
    sum = 0
    rightsum = -float('inf')
    for i in range(mid, len(arr)):
        sum += arr[i]
        if sum > rightsum: rightsum = sum
    return leftsum + rightsum

def max_sum_subarray(arr):
    if len(arr) == 1:
        return arr[0]
    n = len(arr)
    mid = n//2
    return max(max_sum_subarray(arr[:mid]),
                max_sum_subarray(arr[mid:]),
                mid_cross_sum(arr, mid))

