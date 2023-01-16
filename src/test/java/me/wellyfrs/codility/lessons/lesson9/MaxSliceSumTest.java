package me.wellyfrs.codility.lessons.lesson9;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxSliceSumTest {

    private final MaxSliceSum underTest = new MaxSliceSum();

    @Test
    void solution() {
        // given
        int[] A = { 3, 2, -6, 4, 0 };

        // when
        int result = underTest.solution(A);

        // then
        assertThat(result).isEqualTo(5);
    }

}
