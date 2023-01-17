package me.wellyfrs.codility.lessons.lesson7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FishTest {

    private final Fish underTest = new Fish();

    @Test
    void solution() {
        // given
        int[] A = { 4, 3, 2, 1, 5 };
        int[] B = { 0, 1, 0, 0, 0 };

        // when
        int result = underTest.solution(A, B);

        // then
        assertThat(result).isEqualTo(2);
    }

}