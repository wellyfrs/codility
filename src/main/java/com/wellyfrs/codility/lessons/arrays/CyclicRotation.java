package com.wellyfrs.codility.lessons.arrays;

public class CyclicRotation {

    public int[] rotateArray(int[] arr, int steps) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[(i + steps) % arr.length] = arr[i];
        }

        return result;
    }

}