package me.wellyfrs.codility.lessons.lesson6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistinctTest {

    private final Distinct underTest = new Distinct();

    @Test
    void shouldReturnNumberOfDistinctItemsByUsingSorting() {
        // given
        int[] A = {2, 1, 1, 2, 3, 1};

        // when
        int result = underTest.countDistinctItemsUsingSorting(A);

        // then
        assertEquals(3, result);
    }

    @Test
    void shouldReturnNumberOfDistinctItemsByUsingSet() {
        // given
        int[] A = {2, 1, 1, 2, 3, 1};

        // when
        int result = underTest.countDistinctItemsCleverly(A);

        // then
        assertEquals(3, result);
    }
}