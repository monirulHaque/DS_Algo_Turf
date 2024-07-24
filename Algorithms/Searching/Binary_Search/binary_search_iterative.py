def binSearch(arr, L, R, find):
    while L <= R:
        # m = (L + R) // 2
        m = L + (R-L) // 2  # Can prevent 'out of memory' issues
        if arr[m] < find:
            L = m+1
        elif arr[m] > find:
            R = m-1
        else: 
            return m
    return -1

# arr = [12,46,78,92,99,123,598,9687]
# print(binSearch(arr, 0, len(arr), 123))