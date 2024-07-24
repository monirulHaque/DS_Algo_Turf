def reverseWords(s):
    listOfWords = s.split(' ')
    for i in range(len(listOfWords)):
        listOfWords[i] = ''.join(reversed(listOfWords[i]))
    return ' '.join(listOfWords)

print(reverseWords("Hello World I am Monirul Haque"))