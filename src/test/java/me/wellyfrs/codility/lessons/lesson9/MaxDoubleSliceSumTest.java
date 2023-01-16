package me.wellyfrs.codility.lessons.lesson9;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxDoubleSliceSumTest {

    private final MaxDoubleSliceSum underTest = new MaxDoubleSliceSum();

    @Test
    void solution() {
        // given
        int[] A = { 3, 2, 6, -1, 4, 5, -1, 2 };

        // when
        int result = underTest.solution(A);

        // then
        assertThat(result).isEqualTo(17);
    }
}