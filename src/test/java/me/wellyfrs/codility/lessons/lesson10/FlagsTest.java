package me.wellyfrs.codility.lessons.lesson10;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FlagsTest {

    private final Flags underTest = new Flags();

    @Test
    void solution() {
        // given
        int[] A = { 1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2 };

        // when
        int result = underTest.solution(A);

        // then
        assertThat(result).isEqualTo(3);
    }
}