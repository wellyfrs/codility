package me.wellyfrs.codility.lessons.lesson10;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountFactorsTest {

    private final CountFactors underTest = new CountFactors();

    @Test
    void solution() {
        // given
        int N = 24;

        // when
        int result = underTest.solution(N);

        // then
        assertThat(result).isEqualTo(8);
    }
}