package me.wellyfrs.codility.lessons.lesson11;

import java.util.*;

public class CountSemiprimes {

    /**
     * Time complexity: O(N * log(log(N)) + M)
     */
    public int[] solution(int N, int[] P, int[] Q) {
        boolean[] semiprimes = findSemiprimes(N);

        // from this point on it's just a matter of prefix sum
        int[] semiprimePrefixSum = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            semiprimePrefixSum[i] = semiprimePrefixSum[i - 1] + (semiprimes[i] ? 1 : 0);
        }

        int[] result = new int[P.length];

        for (int k = 0; k < P.length; k++) {
            // operation is O(1) because of prefix sum
            result[k] = semiprimePrefixSum[Q[k]] - semiprimePrefixSum[P[k] - 1];
        }

        return result;
    }

    private boolean[] findSemiprimes(int n) {
        List<Integer> primes = findPrimes(n);

        boolean[] semiprimes = new boolean[n + 1]; // all false by default

        for (int i = 0; i < primes.size(); i++) {
            for (int j = i; j < primes.size(); j++) {
                long product = (long) primes.get(i) * (long) primes.get(j);

                if (product > n) {
                    break;
                } else {
                    semiprimes[(int) product] = true;
                }
            }
        }

        return semiprimes;
    }

    private List<Integer> findPrimes(int n) {
        List<Integer> primes = new ArrayList<>();

        boolean[] sieve = sieveOfEratosthenes(n);

        for (int i = 2; i <= n; i++) {
            if (sieve[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    private boolean[] sieveOfEratosthenes(int n) {
        boolean[] sieve = new boolean[n + 1];
        Arrays.fill(sieve, true);

        sieve[0] = false;
        sieve[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (sieve[i]) {
                for (int k = i * i; k <= n; k += i) {
                    sieve[k] = false;
                }
            }
        }

        return sieve;
    }

}
