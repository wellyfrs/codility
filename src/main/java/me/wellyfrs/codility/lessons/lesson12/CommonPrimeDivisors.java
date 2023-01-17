package me.wellyfrs.codility.lessons.lesson12;

public class CommonPrimeDivisors {

    public int solution(int[] A, int[] B) {
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            if (hasSamePrimeDivisors(A[i], B[i])) {
                result++;
            }
        }

        return result;
    }

    private boolean hasSamePrimeDivisors(int a, int b) {
        int gcd = gcd(a, b);

        a = removeCommonPrimeDivisors(a, gcd);

        if (a != 1) {
            return false;
        }

        b = removeCommonPrimeDivisors(b, gcd);

        return b == 1;
    }

    private int removeCommonPrimeDivisors(int x, int y) {
        while (x != 1) {
            int gcd = gcd(x, y);

            if (gcd == 1) {
                break;
            }

            x = x / gcd;
        }

        return x;
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
