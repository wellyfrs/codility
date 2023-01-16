package me.wellyfrs.codility.lessons.lesson10;

public class MinPerimeterRectangle {

    public int solution(int N) {
        int minPerimeter = Integer.MAX_VALUE;

        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                minPerimeter = Math.min(minPerimeter, 2 * (i + N/i));
            }
        }

        return minPerimeter;
    }

}
