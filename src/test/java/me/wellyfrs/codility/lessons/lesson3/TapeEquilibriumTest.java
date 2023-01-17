package me.wellyfrs.codility.lessons.lesson3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TapeEquilibriumTest {

    private final TapeEquilibrium underTest = new TapeEquilibrium();

    @Test
    void testSolution() {
        // given
        int[] arr = {3, 1, 2, 4, 3};

        // when
        int result = underTest.solution(arr);

        // then
        assertThat(result).isEqualTo(1);
    }

}
