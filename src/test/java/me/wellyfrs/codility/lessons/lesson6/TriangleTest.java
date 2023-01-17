package me.wellyfrs.codility.lessons.lesson6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    private final Triangle underTest = new Triangle();

    @Test
    void shouldFindTriangularTriplet() {
        // given
        int[] arr = { 10, 2, 5, 1, 8, 20 };

        // when
        int result = underTest.containsTriangularTriplet(arr);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void shouldNotFindTriangularTriplet() {
        // given
        int[] arr = { 10, 50, 5, 1 };

        // when
        int result = underTest.containsTriangularTriplet(arr);

        // then
        assertThat(result).isEqualTo(0);
    }
}