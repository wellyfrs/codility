package me.wellyfrs.codility.lessons.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TapeEquilibriumTest {

    private final TapeEquilibrium underTest = new TapeEquilibrium();

    @Test
    void testSolution() {
        // given
        int[] arr = {3, 1, 2, 4, 3};

        // when
        int result = underTest.solution(arr);

        // then
        assertEquals(1, result);
    }

}
