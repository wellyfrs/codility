package me.wellyfrs.codility.lessons.lesson5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountDivTest {

    private final CountDiv underTest = new CountDiv();

    @Test
    void solution() {
        // given
        int A = 6;
        int B = 11;
        int K = 2;

        // when
        int result = underTest.solution(A, B, K);

        // then
        assertThat(result).isEqualTo(3);
    }
}