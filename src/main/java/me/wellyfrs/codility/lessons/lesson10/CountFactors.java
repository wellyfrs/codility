package me.wellyfrs.codility.lessons.lesson10;

public class CountFactors {

    public int solution(int N) {
        int result = 0;

        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                if (i * i != N) {
                    result += 2;
                } else {
                    // avoid duplication of sqrt of N
                    result += 1;
                }
            }
        }

        return result;
    }

}
