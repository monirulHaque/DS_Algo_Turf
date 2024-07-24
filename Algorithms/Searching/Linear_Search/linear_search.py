def linear_search(arr, find):
    for i in range(len(arr)):
        if arr[i] == find:
            return i
    return -1