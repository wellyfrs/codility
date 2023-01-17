package me.wellyfrs.codility.lessons.lesson5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinAvgTwoSliceTest {

    private final MinAvgTwoSlice underTest = new MinAvgTwoSlice();

    @Test
    void shouldReturnStartingIndexOfMinAvgSlice() {
        // given
        int[] A = {4, 2, 2, 5, 1, 5, 8};

        // when
        int result = underTest.findStartingIndexOfMinAvgSlice(A);

        // then
        assertThat(result).isEqualTo(1);
    }

}
