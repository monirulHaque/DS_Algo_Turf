def oneEditAway(S, T):
    n = len(S)
    m = len(T)
    if m > n:
        S, T = T, S
        n, m = m, n
    if n-m > 1:
        return False
    
    countOfEdits = 0
    j = 0
    if n == m:
        for i in range(n):
            if S[i] != T[j]:
                countOfEdits += 1
            j += 1
    else:
        for i in range(n):
            if S[i] != T[j]:
                countOfEdits += 1
                continue
            j += 1
    if countOfEdits == 1:
        return True
    return False

# print(oneEditAway("pale", "bake"))