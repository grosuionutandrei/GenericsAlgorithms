package com.company;

import java.util.InputMismatchException;

public class SwitchElements {
    public static <T> void switchAllElementsInArray(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            T temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
    }

    public static <T> void switchAtSpecificIndex(T[] array, String index) {
        int specificIndex = Integer.parseInt(index);
        try {
            if(array==null){
                throw new ValidationException("This array  is null");
            }
            if (specificIndex > array.length) {
                throw new ValidationException("Index '" + specificIndex + "' is bigger than array length");
            }
            if (array.length == 1) {
                System.out.println("This array contains only one element " + array[0]);
            }
            for (int i = 0; i < array.length - 1; i++) {
                if (specificIndex == i) {
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        } catch (InputMismatchException e) {
            throw new RuntimeException(" Specific index can not be converted" + e);
        }
    }
}
