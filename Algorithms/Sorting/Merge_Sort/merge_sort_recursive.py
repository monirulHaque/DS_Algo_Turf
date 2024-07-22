def mergeSort(arr):
    if len(arr) <= 1:
        return arr
    mid = len(arr)//2
    L2 = mergeSort(arr[:mid])
    R2 = mergeSort(arr[mid:])
    return merge(L2, R2)

def merge(arr1, arr2):
    marr, i, j = [], 0, 0
    while i < len(arr1) and j < len(arr2):
        if arr1[i] < arr2[j]:
            marr.append(arr1[i])
            i+=1
        else: 
            marr.append(arr2[j])
            j+=1
    marr += arr1[i:]
    marr += arr2[j:]
    return marr