package ua.goit.javaCore4.homework8;

import java.util.Arrays;

public class MyArrayList {
    private int defaultSize = 0;
    private Object[] myArray = new Object[defaultSize];
    private int size = defaultSize;

    public void add(Object value) {
        size++;
        myArray = Arrays.copyOf(myArray, size);
        myArray[myArray.length - 1] = value;
    }

    public boolean remove(int index) {
        if (index > myArray.length - 1) {
            return false;
        }
        for (int i = index + 1; i < myArray.length; i++) {
            myArray[i - 1] = myArray[i];
        }
        myArray = Arrays.copyOf(myArray, myArray.length - 1);
        return true;
    }

    public void clear() {
        myArray = Arrays.copyOf(myArray, 0);
    }

    public int size() {
        return myArray.length;
    }

    public Object get(int index) {
        return myArray[index];
    }

    public String print() {
        return Arrays.toString(myArray);
    }
}
