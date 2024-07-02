import java.util.Objects;

/**
 * A Dynamic Array class with Java Generics
 * It also has almost every kind of useful methods
 */
public class MyDynamicArray<T> {
    private T array[];
    private int indicator = -1; //it stays where the last item is put

    /**
     * Constructor for Initializing an empty Dynamic Array
     * The default size of the Dynamic Array is 4
     */
    public MyDynamicArray() {
        array = (T[]) new Object[4];
    }

    /**
     * Constructor for Initializing a Dynamic Array based on a given array
     * The size of the Dynamic Array will be a power of two (the next nearest of the original array size)
     * 
     * @param arr the array to initialize the Dynamic Array with
     */
    public MyDynamicArray(T arr[]) {
        //Finding the power of 2 equal or greater than the size of arr
        int length = arr.length;
        int positionOfSetBit = (int) Math.ceil(Math.log(length));
        int powerOfTwo = (int) Math.pow(2, positionOfSetBit);

        //Creating and copying the elements into new array
        array = (T[]) new Object[powerOfTwo];
        for (int i = 0; i < length; i++) {
            array[i] = arr[i];
        }
    }

    /**
     * Returns the number of elements in the Dynamic Array.
     * 
     * @return the number of elements in the Dynamic Array
     */
    public int size() {
        return indicator+1;
    }

    /**
     * Returns the number of elements the Dynamic Array can hold.
     * 
     * @return the capacity of the Dynamic Array
     */
    public int capacity() {
        return array.length;
    }

    /**
     * Checks if the Dynamic Array has any elements.
     * 
     * @return true if the Dynamic Array is empty, false otherwise
     */
    public boolean is_empty() {
        if(indicator < 0) return true;
        return false;
    }

    /**
     * Returns the element at the specified position in the Dynamic Array.
     * 
     * @param index the index of the element to return
     * @return the element at the specified position
     * @throws ArrayIndexOutOfBoundsException if the index is out of range
     */
    public T at(int index) {
        if (index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();
        return array[index];
    }

    /**
     * Appends the specified element to the end of the Dynamic Array.
     * 
     * @param item the element to be appended
     */
    public void push(T item) {
        indicator++;
        if (indicator >= capacity()) resize(true);
        array[indicator] = item;
    }

    /**
     * Inserts the specified element at the specified position in the Dynamic Array.
     * Shifts the element currently at that position (if any) and any subsequent elements to the right.
     * 
     * @param index the index at which the specified element is to be inserted
     * @param item the element to be inserted
     * @throws ArrayIndexOutOfBoundsException if the index is out of range
     */
    public void insert(int index, T item) {
        if (index < 0 || index > size()) throw new ArrayIndexOutOfBoundsException();
        if (size() == capacity()) resize(true);
        T temp = array[index];
        array[index] = item;
        for (int i = index+1; i < size(); i++) {
            T temp2 = array[i];
            array[i] = temp;
            temp = temp2;
        }
        array[size()] = temp;
        indicator++;
    }

    /**
     * Inserts the specified element at the beginning of the Dynamic Array.
     * It inserts at index 0; the opposite of push method.
     * 
     * @param item the element to be inserted
     */
    public void prepend(T item) {
        insert(0, item);
    }

    /**
     * Removes and returns the last element from the Dynamic Array.
     * 
     * @return the last element from the Dynamic Array
     * @throws NullPointerException if the Dynamic Array is empty
     */
    public T pop() {
        //remove from end and return the value
        if (indicator < 0 ) throw new NullPointerException();
        T item = array[indicator];
        array[indicator] = null;
        indicator--;
        //when popping an item, if size is 1/4 of capacity, resize to half
        if (size() <= capacity()/4) resize(false);
        return item;
    }

    /**
     * Removes and returns the element at the specified position in the Dynamic Array.
     * Shifts any subsequent elements to the left.
     * 
     * @param index the index of the element to be removed
     * @return the element that was removed from the Dynamic Array
     * @throws ArrayIndexOutOfBoundsException if the index is out of range
     */
    public T delete(int index) {
        //delete item at index, shifting all trailing elements left
        if (index < 0 || index > size()) throw new ArrayIndexOutOfBoundsException();
        T item = array[index];
        for (int i = index+1; i < size(); i++) {
            array[i-1] = array[i];
        }
        indicator--;
        //when popping an item, if size is 1/4 of capacity, resize to half
        if (size() <= capacity()/4) resize(false);
        return item;
    }

    /**
     * Removes all occurrences of the specified element from the Dynamic Array.
     * 
     * @param item the element to be removed
     */
    public void remove(T item) {
        //looks for value and removes index holding it (even if in multiple places)
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(item)) delete(i);
        }
    }

    /**
     * Returns the index of the first occurrence of the specified element in the Dynamic Array,
     * or -1 if this Dynamic Array does not contain the element.
     * 
     * @param item the element to search for
     * @return the index of the first occurrence of the specified element, or -1 if not found
     */
    public int find(T item) {
        //looks for value and returns first index with that value, -1 if not found
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(item)) return i;
        }
        return -1;
    }

    /**
     * Resizes the Dynamic Array.
     * When the Dynamic Array reaches capacity, resize method is used to double the capacity
     * When popping an item, if size is 1/4 of capacity, the method is used to resize to half
     * If enlarge is true, the array capacity gets doubled.
     * If enlarge is false, the array capacity gets halved.
     * 
     * @param enlarge whether to enlarge or shrink the array
     */
    private void resize(boolean enlarge) {
        int newCapacity;
        newCapacity = enlarge?capacity()*2:capacity()/2;
        T newArray[] = (T[]) new Object[newCapacity];
        for (int i = 0; i < size() - 1; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    /**
     * Returns a string representation of the Dynamic Array.
     * 
     * @return string representation of the Dynamic Array
     */
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size(); i++) {
            s += array[i];
            if (i == size()-1) break;
            s += " ";
        }
        return s;
    }
}
