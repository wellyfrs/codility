package me.wellyfrs.codility.lessons.lesson4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxCountersTest {

    private final MaxCounters underTest = new MaxCounters();

    @Test
    void testSolution() {
        // given
        int N = 5;
        int[] arr = { 3, 4, 4, 6, 1, 4, 4 };

        // when
        int[] result = underTest.calculateCounters(N, arr);

        // then
        assertThat(result).isEqualTo(new int[] { 3, 2, 2, 4, 2 });
    }
}