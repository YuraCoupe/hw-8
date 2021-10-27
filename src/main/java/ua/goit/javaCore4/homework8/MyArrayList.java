package ua.goit.javaCore4.homework8;

import java.util.Arrays;

public class MyArrayList {
    private final int defaultSize = 10;
    private Object[] myArray = new Object[defaultSize];
    private int size = defaultSize;

    private int cursor = 0;

    public void add(Object value) {
        if (cursor == size) {
            size = size + 1;
            myArray = Arrays.copyOf(myArray, size);
        }
        myArray[cursor] = value;
        cursor++;
    }

    public boolean remove(int index) {
        if (index >= cursor | size == 0) {
            return false;
        }
        for (int i = index + 1; i < cursor; i++) {
            myArray[i - 1] = myArray[i];
        }
        myArray[cursor -1] = null;
        size--;
        cursor--;
        if (size > defaultSize) {
            myArray = Arrays.copyOf(myArray, size);
        }
        return true;
    }

    public void clear() {
        myArray = Arrays.copyOf(myArray, defaultSize);
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = null;
        }
        size = defaultSize;
        cursor = 0;
    }

    public int size() {
        return cursor;
    }

    public Object get(int index) {
        return myArray[index];
    }

    public String print() {
        return Arrays.toString(myArray);
    }
}
