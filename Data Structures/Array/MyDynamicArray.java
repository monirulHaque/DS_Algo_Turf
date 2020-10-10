public class MyDynamicArray<T> {
    T array[];
    int indicator = -1;

    public MyDynamicArray() {
        array = (T[]) new Object[4];
    }
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
    public int size() {
        //number of items
        return indicator+1;
    }
    public int capacity() {
        //number of items it can hold
        return array.length;
    }
    public boolean is_empty() {
        //check if the array has any items
        if(indicator < 0) return true;
        return false;
    }
    public T at(int index) throws Exception {
        //returns item at given index, blows up if index out of bounds
        if (index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();
        return array[index];
    }
    public void push(T item) {
        //push item into the array.
        indicator++;
        if (indicator > size()) resize(true);
        array[indicator] = item;
    }
    public void insert(int index, T item) {
        /*inserts item at index, shifts that index's value
        and trailing elements to the right*/
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
    public void prepend(T item) {
        //insert above at index 0, opposite of push
        insert(0, item);
    }
    public T pop() {
        //remove from end and return the value
        return null;
    }
    public void delete(int index) {
        //delete item at index, shifting all trailing elements left
    }
    public void remove(T item) {
        //looks for value and removes index holding it (even if in multiple places)
    }
    public int find(T item) {
        //looks for value and returns first index with that value, -1 if not found
        return -1;
    }
    private void resize(boolean enlarge) {
        //when you reach capacity, resize to double the size
        //when popping an item, if size is 1/4 of capacity, resize to half
        //if enlarge is true the array capacity gets doubled
        //if enlarge is false the array capacity get halved
    }


}
