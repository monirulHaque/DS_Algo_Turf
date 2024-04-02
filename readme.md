Implementation of Data Structures and Algorithms along with interview questions appeared in giant software companies like Facebook, Google, Microsoft, Amazon, Adobe etc with efficient solve are being stored in this repository.
# Data Structures
## Array
### Dynamic Array
Implementation of **[MyDynamicArray](Data_Structures/Array/MyDynamicArray.java)** :
- [ ] size(): number of items in array
- [ ] capacity(): number of items it can hold
- [ ] is_empty(): check if the array has any items
- [ ] at(index): returns item at given index, blows up if index out of bounds
- [ ] push(item): push item into the array.
- [ ] insert(index, item): inserts item at index, shifts that index's value and trailing elements to the right
- [ ] prepend(item): insert above at index 0, opposite of push
- [ ] pop(): remove from end and return the value
- [ ] delete(index): when popping an item, if size is 1/4 of capacity, resize to half
- [ ] remove(item): delete item at index, shifting all trailing elements left
- [ ] find(item): looks for value and removes index holding it (even if in multiple places)
- [ ] resize(): {private method} when you reach capacity, resize to double the size when popping an item, if size is 1/4 of capacity, resize to half
- [ ] toString(): {overriden} prints all the elements following a space between them
#### Interview questions
1. [Maximum sum subarray](Problems_with_Solutions/Arrays/Max_Sum_Subarray/)
2. [Find subarray of array with given sum](Problems_with_Solutions/Arrays/Subarray_with_given_sum/)
3. [Find the missing number in array](Problems_with_Solutions/Arrays/Missing_number/)
4. [Find the number of pairs in two arrays](Problems_with_Solutions/Arrays/Number_of_pairs/)
5. [Count the triplets](Problems_with_Solutions/Arrays/Count_triplets/)