package me.wellyfrs.codility.lessons.lesson6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfDiscIntersectionsTest {

    private final NumberOfDiscIntersections underTest = new NumberOfDiscIntersections();

    @Test
    void solution() {
        // given
        int[] arr = { 1, 5, 2, 1, 4, 0 };

        // when
        int result = underTest.countDiscIntersections(arr);

        // then
        assertThat(result).isEqualTo(11);
    }
}