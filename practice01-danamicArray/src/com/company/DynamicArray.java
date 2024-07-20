package com.company;

public class DynamicArray {
    public DynamicArray () {}

    private int capacity = 10;
    private int[] nums = new int[capacity];
    private int size = 0;

    public int size() {
        return this.size;
    }

    public void add (int num) {
        if (size >= capacity) {
            capacity = capacity * 2;
            nums = new int[capacity];
        }

        nums[size++] = num;
    }

    public void removeLast () {
        size--;
    }

    public void remove (int indexRM) {
        throwException(indexRM);

        int[] numsTemp = new int[capacity];
        int indexTemp = 0;
        for (int indexNums = 0; indexNums < size; indexNums++) {
            if (indexNums != indexRM) {
                numsTemp[indexTemp] = nums[indexNums];
                indexTemp++;
            }
        }

        nums = numsTemp;
        size--;
    }

    public void set (int indexSet, int value) {
        throwException(indexSet);
        nums[indexSet] = value;
    }

    public int get (int index) {
        throwException(index);
        return nums[index];
    }

    public void throwException (int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

}