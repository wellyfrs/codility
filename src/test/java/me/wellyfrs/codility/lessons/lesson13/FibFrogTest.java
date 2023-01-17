package me.wellyfrs.codility.lessons.lesson13;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FibFrogTest {

    private final FibFrog underTest = new FibFrog();

    @Test
    void solution() {
        // given
        int[] A = { 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0 };

        // when
        int result = underTest.solution(A);

        // then
        assertThat(result).isEqualTo(3);
    }
}