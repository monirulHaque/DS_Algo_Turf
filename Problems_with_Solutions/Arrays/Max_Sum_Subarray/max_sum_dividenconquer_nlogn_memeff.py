
def mid_cross_sum(arr, low, mid, high):
    sum = 0
    leftsum = -float('inf')
    for i in range(mid, low, -1):
        sum += arr[i]
        if sum > leftsum: leftsum = sum
    sum = 0
    rightsum = -float('inf')
    for i in range(mid+1, high+1):
        sum += arr[i]
        if sum > rightsum: rightsum = sum
    return leftsum + rightsum

def max_sum_subarray(arr, low, high):
    if low == high:
        return arr[0]
    mid = (low+high)//2
    return max(max_sum_subarray(arr, low, mid),
                max_sum_subarray(arr, mid+1, high),
                mid_cross_sum(arr, low, mid, high))

