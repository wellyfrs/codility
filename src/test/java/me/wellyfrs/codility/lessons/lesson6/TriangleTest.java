package me.wellyfrs.codility.lessons.lesson6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private final Triangle underTest = new Triangle();

    @Test
    void shouldFindTriangularTriplet() {
        // given
        int[] arr = { 10, 2, 5, 1, 8, 20 };

        // when
        int result = underTest.containsTriangularTriplet(arr);

        // then
        assertEquals(1, result);
    }

    @Test
    void shouldNotFindTriangularTriplet() {
        // given
        int[] arr = { 10, 50, 5, 1 };

        // when
        int result = underTest.containsTriangularTriplet(arr);

        // then
        assertEquals(0, result);
    }
}