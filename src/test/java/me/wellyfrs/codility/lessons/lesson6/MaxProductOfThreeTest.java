package me.wellyfrs.codility.lessons.lesson6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProductOfThreeTest {

    private final MaxProductOfThree underTest = new MaxProductOfThree();

    @Test
    void solution() {
        // given
        int[] arr = { -3, 1, 2, -2, 5, 6 };

        // when
        int result = underTest.calculateMaxProductOfTriplets(arr);

        // then
        assertEquals(60, result);
    }
}