def twoSum_followup1(arr, total):
    for i in range(len(arr)):
        j = binSearch(arr, i+1, len(arr)-1, total-arr[i])
        if j != -1:
            return i, j
    raise ValueError("No Solution")
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

# print(twoSum_followup1([-4, -1, 1, 3, 5, 6, 8, 11], 10))


