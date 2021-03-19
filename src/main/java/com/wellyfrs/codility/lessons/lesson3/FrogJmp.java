package com.wellyfrs.codility.lessons.lesson3;

public class FrogJmp {

    @SuppressWarnings("squid:S117")
    public int solution(int X, int Y, int D) {
        return (int) Math.ceil((double) (Y - X) / D);
    }

}