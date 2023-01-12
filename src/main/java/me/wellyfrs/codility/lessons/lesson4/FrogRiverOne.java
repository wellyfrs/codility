package me.wellyfrs.codility.lessons.lesson4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public int solution(int lastPosition, int[] fallingLeaves) {
        Set<Integer> positions = new HashSet<>();

        for (int k = 0; k < fallingLeaves.length; k++) {
            if (fallingLeaves[k] <= lastPosition) {
                positions.add(fallingLeaves[k]);
            }

            if (positions.size() == lastPosition) {
                return k;
            }
        }

        return -1;
    }

}
