package com.wellyfrs.codility.lessons.countingelements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxCountersTest {

    private final MaxCounters underTest = new MaxCounters();

    @Test
    void testSolution() {
        // given
        int N = 5;
        int[] arr = { 3, 4, 4, 6, 1, 4, 4 };

        // when
        int[] result = underTest.calculateCounters(N, arr);

        // then
        assertArrayEquals(new int[] { 3, 2, 2, 4, 2 }, result);
    }
}