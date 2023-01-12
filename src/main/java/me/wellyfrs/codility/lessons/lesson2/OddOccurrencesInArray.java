package me.wellyfrs.codility.lessons.lesson2;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public int findUnpairedElement(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int a : arr) {
            freq.put(a, freq.containsKey(a) ? freq.get(a) + 1 : 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }

        return 0;
    }

}