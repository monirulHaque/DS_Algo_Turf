def twoSum_followup1(arr, total):
    L = 0
    R = len(arr) - 1
    while L < R:
        if arr[L] + arr[R] == total:
            return L, R
        if arr[L] + arr[R] < total:
            L += 1
        else: 
            R -= 1
    raise ValueError("No Solution")