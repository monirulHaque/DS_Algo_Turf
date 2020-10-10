import java.util.Objects;

public class MyDynamicArray<T> {
    private T array[];
    private int indicator = -1; //it stays where the last item is put

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
    public T at(int index) {
        //returns item at given index, blows up if index out of bounds
        if (index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();
        return array[index];
    }
    public void push(T item) {
        //push item into the array.
        indicator++;
        if (indicator >= capacity()) resize(true);
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
        if (indicator < 0 ) throw new NullPointerException();
        T item = array[indicator];
        array[indicator] = null;
        indicator--;
        //when popping an item, if size is 1/4 of capacity, resize to half
        if (size() <= capacity()/4) resize(false);
        return item;
    }
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
    public void remove(T item) {
        //looks for value and removes index holding it (even if in multiple places)
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(item)) delete(i);
        }
    }
    public int find(T item) {
        //looks for value and returns first index with that value, -1 if not found
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(item)) return i;
        }
        return -1;
    }
    private void resize(boolean enlarge) {
        //when you reach capacity, resize to double the size
        //when popping an item, if size is 1/4 of capacity, resize to half
        //if enlarge is true the array capacity gets doubled
        //if enlarge is false the array capacity get halved
        int newCapacity;
        newCapacity = enlarge?capacity()*2:capacity()/2;
        T newArray[] = (T[]) new Object[newCapacity];
        for (int i = 0; i < size() - 1; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

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
