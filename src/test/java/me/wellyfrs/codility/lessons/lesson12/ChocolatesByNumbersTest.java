package me.wellyfrs.codility.lessons.lesson12;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ChocolatesByNumbersTest {

    private final ChocolatesByNumbers underTest = new ChocolatesByNumbers();

    @Test
    void solution() {
        // given
        int N = 10;
        int M = 4;

        // when
        int result = underTest.solution(N, M);

        // then
        assertThat(result).isEqualTo(5);
    }
}