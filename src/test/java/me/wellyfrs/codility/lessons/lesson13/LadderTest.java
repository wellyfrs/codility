package me.wellyfrs.codility.lessons.lesson13;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LadderTest {

    private final Ladder underTest = new Ladder();

    @Test
    void solution() {
        // given
        int[] A = { 4, 4, 5, 5, 1 };
        int[] B = { 3, 2, 4, 3, 1 };

        // when
        int[] result = underTest.solution(A, B);

        // then
        assertThat(result).isEqualTo(new int[] { 5, 1, 8, 0, 1 });
    }
}