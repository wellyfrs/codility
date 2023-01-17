package me.wellyfrs.codility.lessons.lesson12;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CommonPrimeDivisorsTest {

    private final CommonPrimeDivisors underTest = new CommonPrimeDivisors();

    @Test
    void solution() {
        // given
        int[] A = { 15, 10, 3 };
        int[] B = { 75, 30, 5 };

        // when
        int result = underTest.solution(A, B);

        // then
        assertThat(result).isEqualTo(1);
    }
}