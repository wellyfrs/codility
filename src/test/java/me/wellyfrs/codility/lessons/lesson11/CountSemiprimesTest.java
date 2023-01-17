package me.wellyfrs.codility.lessons.lesson11;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountSemiprimesTest {

    private final CountSemiprimes underTest = new CountSemiprimes();

    @Test
    void solution() {
        // given
        int N = 26;
        int[] P = { 1, 4, 16 };
        int[] Q = { 26, 10, 20 };

        // when
        int[] result = underTest.solution(N, P, Q);

        // then
        assertThat(result).isEqualTo(new int[] { 10, 4, 0 });
    }

}
