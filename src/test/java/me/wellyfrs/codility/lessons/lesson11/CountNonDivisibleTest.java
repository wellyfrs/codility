package me.wellyfrs.codility.lessons.lesson11;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CountNonDivisibleTest {

    private final CountNonDivisible underTest = new CountNonDivisible();

    @Test
    void solution() {
        // given
        int[] A = { 3, 1, 2, 3, 6 };

        // when
        int[] result = underTest.solution(A);

        // then
        assertThat(result).isEqualTo(new int[]{ 2, 4, 3, 2, 0 });
    }
}