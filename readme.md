# Data Structures
## Array
### &nbsp;&nbsp;Dynamic Array
&nbsp;&nbsp;&nbsp;&nbsp;Implementation of [MyDynamicArray](Data_Structures/Array/MyDynamicArray.java) :
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