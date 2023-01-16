package me.wellyfrs.codility.lessons.lesson8;

import java.util.HashMap;
import java.util.Map;

public class EquiLeader {

    public int solution(int[] A) {
        // There is only equi leader if there is a leader
        Map<Integer, Integer> count = new HashMap<>();

        int leaderOfA = -1;

        for (int element : A) {
            count.put(element, count.getOrDefault(element, 0) + 1);

            if (count.get(element) > A.length / 2) {
                leaderOfA = element;
            }
        }

        int result = 0;
        int numOfALeadsOnTheLeft = 0;

        for (int i = 0; i < A.length; i++) {
            // count leaders of A on the left
            if (A[i] == leaderOfA) {
                numOfALeadsOnTheLeft++;
            }

            if (numOfALeadsOnTheLeft > 0.5 * (i + 1)) {
                int numOfLeadsOnTheRight = count.get(leaderOfA) - numOfALeadsOnTheLeft;

                if (numOfLeadsOnTheRight > 0.5 * (A.length - i - 1)) {
                    result++;
                }
            }
        }

        return result;
    }

}
