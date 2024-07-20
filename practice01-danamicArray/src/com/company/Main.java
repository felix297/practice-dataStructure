package com.company;

public class Main {
    public static void main (String[] args) throws Exception {
        DynamicArray array = new DynamicArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.set(2, 4);

        System.out.println("The size of array before removal is: " + array.size());
        System.out.println("The elements of array before removal are: ");
        for (int index = 0; index < array.size(); index ++) {
            System.out.println(array.get(index));
        }
        array.remove(0);

        System.out.println("The size of array after removal is: " + array.size());
        System.out.println("The elements of array before removal are: ");
        for (int index = 0; index < array.size(); index++) {
            System.out.println(array.get(index));
        }
    }
}