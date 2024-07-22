def twoSum(arr, target):
    ht = {}      # hashtable for keeping track of the indexes of the elements
    for i in range(len(arr)):
        ht[arr[i]] = i
    ht2 = {}     # hashtable for keeping target-element
    for elem in arr:
        if elem not in ht2:
            ht2[target-elem] = elem
        else:
            return ht[ht2[elem]], ht[elem]
    raise ValueError("No Solution")