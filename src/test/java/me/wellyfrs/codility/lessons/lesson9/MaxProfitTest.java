package me.wellyfrs.codility.lessons.lesson9;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {

    private final MaxProfit underTest = new MaxProfit();

    @Test
    void solution() {
        // given
        int[] A = { 23171, 21011, 21123, 21366, 21013, 21367 };

        // when
        int result = underTest.solution(A);

        // then
        assertThat(result).isEqualTo(356);
    }
}