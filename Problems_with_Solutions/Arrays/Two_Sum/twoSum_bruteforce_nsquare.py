def twoSum(arr, total):
    for i in range(len(arr)):
        for j in range(i+1, len(arr)):
            if arr[i] + arr[j] == total:
                return i, j
    raise ValueError("No Solution")