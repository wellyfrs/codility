package me.wellyfrs.codility.lessons.lesson3;

public class FrogJmp {

    public int calculateMinNumberOfJumps(int origin, int destiny, int distance) {
        return (int) Math.ceil((double) (destiny - origin) / distance);
    }

}