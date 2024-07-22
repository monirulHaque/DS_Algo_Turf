def mergeSort(arr, left, right):
    if left >= right:
        return arr
    mid = (left+right)//2
    mergeSort(arr, left, mid-1)
    mergeSort(arr, mid, right)

    marr, i, j = [], 0, mid
    while i < mid and j <= right:
        if arr[i] < arr[j]:
            marr.append(arr[i])
            i+=1
        else: 
            marr.append(arr[j])
            j+=1
    marr += arr[i:mid]
    marr += arr[j:right]
    return marr