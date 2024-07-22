def binSearch(arr, L, R, find):
    if L > R:
        return -1
    m = (L + R) // 2
    if arr[m] < find:
        return binSearch(arr, m+1, R, find)
    elif arr[m] > find:
        return binSearch(arr, L, m-1, find)
    else: 
        return m