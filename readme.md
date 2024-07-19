This is a repository Data Structures and Algorithms notes with my understating of concepts, implementations and common interview problems with my solutions.
# Data Structures
Data structures are ways of organizing and storing data in a computer's memory so that it can be efficiently accessed and modified.
## Array
An array is the simplest way to store multiple elements in memory. It allocates a continuous block of memory and stores the elements sequentially. 

Each element occupies the same amount of space. To access the nth element in the array, processor calculates its memory address using a formula: 
*start address + (element size × n)*

The time complexity of accessing an element in array is *O(1)*; that means it's instantaneous.

### Dynamic Array
Implementation of MyDynamicArray **[(Java)](Data_Structures/Array/MyDynamicArray.java)**:
- [x] size(): number of items in array
- [x] capacity(): number of items it can hold
- [x] is_empty(): check if the array has any items
- [x] at(index): returns item at given index, blows up if index out of bounds
- [x] push(item): push item into the array.
- [x] insert(index, item): inserts item at index, shifts that index's value and trailing elements to the right
- [x] prepend(item): insert above at index 0, opposite of push
- [x] pop(): remove from end and return the value
- [x] delete(index): when popping an item, if size is 1/4 of capacity, resize to half
- [x] remove(item): delete item at index, shifting all trailing elements left
- [x] find(item): looks for value and removes index holding it (even if in multiple places)
- [x] resize(): {private method} when you reach capacity, resize to double the size when popping an item, if size is 1/4 of capacity, resize to half
- [x] toString(): {overriden} prints all the elements following a space between them
- [x] javadocs

### Circular Array
To be implemented. 

#### Interview questions
- [Maximum Sum Subarray](Problems_with_Solutions/Arrays/Max_Sum_Subarray/)
- [Find subarray of array with given sum](Problems_with_Solutions/Arrays/Subarray_with_given_sum/)
- [Find the missing number in array](Problems_with_Solutions/Arrays/Missing_number/)
- [Find the number of pairs in two arrays](Problems_with_Solutions/Arrays/Number_of_pairs/)
- [Count the triplets](Problems_with_Solutions/Arrays/Count_triplets/)

## LinkedLists
To be added.