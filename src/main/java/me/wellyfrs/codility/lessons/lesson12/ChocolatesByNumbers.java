package me.wellyfrs.codility.lessons.lesson12;

public class ChocolatesByNumbers {

    public int solution(int N, int M) {
        return N / gcd(N, M);
    }

    // Euclidean Algorithm
    private int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }

}
