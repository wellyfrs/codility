package me.wellyfrs.codility.lessons.lesson5;

public class GenomicRangeQuery {

    private static final int A = 0;
    private static final int C = 1;
    private static final int G = 2;

    enum Nucleotide {
        A(1),
        C(2),
        G(3),
        T(4);

        final int impactFactor;

        Nucleotide(int impactFactor) {
            this.impactFactor = impactFactor;
        }
    }

    public int[] findMinImpactFactor(String S, int[] P, int[] Q) {
        int[][] genoms = new int[3][S.length() + 1];

        // calculate prefix sum
        for (int i = 1; i <= S.length(); i++) {
            int a = S.charAt(i - 1) == 'A' ? 1 : 0;
            int c = S.charAt(i - 1) == 'C' ? 1 : 0;
            int g = S.charAt(i - 1) == 'G' ? 1 : 0;

            genoms[A][i] = genoms[A][i - 1] + a;
            genoms[C][i] = genoms[C][i - 1] + c;
            genoms[G][i] = genoms[G][i - 1] + g;
        }

        int[] result = new int[P.length];

        for (int k = 0; k < P.length; k++) {
            int start = P[k] + 1;
            int end = Q[k] + 1;

            if (genoms[A][end] - genoms[A][start - 1] > 0) {
                result[k] = Nucleotide.A.impactFactor;
            } else if (genoms[C][end] - genoms[C][start - 1] > 0) {
                result[k] = Nucleotide.C.impactFactor;
            } else if (genoms[G][end] - genoms[G][start - 1] > 0) {
                result[k] = Nucleotide.G.impactFactor;
            } else {
                result[k] = Nucleotide.T.impactFactor;
            }
        }

        return result;
    }
}
