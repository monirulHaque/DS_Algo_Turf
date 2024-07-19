# Converting every character of the string to lower case and then ascii value.  
# Putting all the ascii characters in an array of size 128 or hash table as key. 
def is_unique(input_str):
    d = {}
    for c in input_str:
        char_ascii = ord(c.lower())
        if char_ascii not in d:
            d[char_ascii] = 1
        else:
            return False
    return True
