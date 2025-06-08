This is a repository Data Structures and Algorithms notes with my understating of concepts, implementations and common interview problems with my solutions.
I'm still confused about the structure I should follow to organize this repo.

# Asymptotic Analysis
Resources considered in Algorithm Analysis:
- Time Complexity
- Space Complexity

There are two kinds of analysis of algorithms
- **Apostiary Analysis**: It is the exact time and storage taken to run an algorithm. It depends on the programming language, compiler and the hardware.  
- **Apriori Analysis**: It is an approximate time and space needed to run the algorithm. It is independent of programming language, compiler and system. We use Asymptotic Notations to describe apriori analysis.
<br/>

The study of change in performance of the algorithm with the change in the order of the input size is defined as Asymptotic Analysis. </br>
Types of Asymptotic Notations:
- ***O* (Big-O Notation)**: Worst Case Complexity
- ***Ω* (Omega Notation)**: Best Case Complexity
- ***ϴ* (Theta Notation)**: Average Case Complexity
</br>
Big-O notation is the most important one because if my algorithm runs good in the worst case scenerio, it will definitely run good in the average and best case scenerio. Basically Big-O notation indicates the rate of growth. We focus on the most frequently performed operations, often called dominant operations, while leaving some uncounted. Most of the times addition, subtraction, multiplication, swapping, printing etc are the dominant operations.

Common Complexity Categories:
- Constant O(1)
- Logarithmic O(Logn)
- Square Root O(√n)
- Linear O(n)
- O(nlogn)
- Quadratic O(n<sup>2</sup>)
- Cubic O(n<sup>3</sup>)
- Exponential O(c<sup>n</sup>)
- Polynomial O(n!)

## Time Complexity
### Recursion Time Complexity
#### Recurrence Relations
#### Master Theorem


<p>
<img src="Media/Big-O_CheatSheet.png">
</p>

<!-- # Programming Techniques
## Recursion and Backtracking
## Divide and Conquer
## Bit Manipulation
## Two Pointers
## Sliding Window
## Greedy
## Dynamic Programming -->


# Data Structures and Algorithms
Data structures are ways of organizing and storing data in a computer's memory so that it can be efficiently accessed and modified. </br>
An algorithm is a sequence of computational steps that transform the input into the output. 
## Arrays and Hash Tables
### Array 
An array is the simplest way to store multiple elements in memory. It allocates a continuous block of memory and stores the elements sequentially. <br/><br/>

Each element occupies the same amount of space. To access the nth element in the array, processor calculates its memory address using a formula: <br/>
*start address + (element size × n)*
<br/><br/>
The time complexity of accessing an element in array is *O(1)*; that means it's instantaneous.

#### Dynamic Array
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

#### Circular Array
To be implemented. 

### Hash Table
To be added.

## LinkedLists
To be added.
### Singly LinkedList
To be added. Dummy Headed and non-dummy headed implementations.
### Doubly LinkedList
To be added. Dummy Headed and non-dummy headed implementations.
### Skip List
## Stack
## Queue
### Priority Queue
## Graph
## Tree
### Binary Search Trees
### Red Black Trees
## Heap

# Algorithms
## Sorting Algorithms
### Bogo Sort
### Bubble Sort
### Selection Sort
### Insertion Sort
### Count Sort
### Merge Sort
#### Implementations
- Python
  * **<a href='merge_sort_iterative.py'>Merge Sort Iterative</a>**
  * **<a href='merge_sort_recursive.py'>Merge Sort Recursive</a>**
### Quick Sort
### Heap Sort
### Tree Sort
### Bucket Sort
### Radix Sort
### Tim Sort
### Shell Sort

## Searching Algorithms
### Linear Search
### Binary Search
#### Implementations
- Python
  * **<a href='binary_search_iterative.py'>Binary Search Iterative</a>**
  * **<a href='binary_search_recursive.py'>Binary Search Recursive</a>**
### Ternary Search

## Array Algorithms
### Kadane's Algorithms
### Prefix Sum

# Interview questions
## Arrays and Hash Tables
- [Maximum Sum Subarray](Problems_with_Solutions/Arrays/Max_Sum_Subarray/)
- [Two Sum](Problems_with_Solutions/Arrays/Two_Sum)
- [Find subarray of array with given sum](Problems_with_Solutions/Arrays/Subarray_with_given_sum/)
- [Find the missing number in array](Problems_with_Solutions/Arrays/Missing_number/)
- [Find the number of pairs in two arrays](Problems_with_Solutions/Arrays/Number_of_pairs/)
- [Count the triplets](Problems_with_Solutions/Arrays/Count_triplets/)
- [Is Unique](Problems_with_Solutions/Arrays/Is_Unique)
