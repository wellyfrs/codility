package me.wellyfrs.codility.lessons.lesson3;

public class PermMissingElem {

    public int findMissingElement(int[] arr) {
        long n = (long) arr.length + 1;
        long sum = 0;

        for (int a : arr) {
            sum += a;
        }

        return (int) ((n * (n + 1) / 2) - sum);
    }

}