package com.wellyfrs.codility.lessons.timecomplexity;

public class FrogJmp {

    public int calculateMinNumberOfJumps(int origin, int destiny, int distance) {
        return (int) Math.ceil((double) (destiny - origin) / distance);
    }

}