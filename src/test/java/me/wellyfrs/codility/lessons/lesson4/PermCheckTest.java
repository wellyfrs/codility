package me.wellyfrs.codility.lessons.lesson4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PermCheckTest {

    private final PermCheck underTest = new PermCheck();

    @Test
    void shouldCheckTruePermutation() {
        // given
        int[] arr = { 4, 1, 3, 2 };

        // when
        int result = underTest.isPermutation(arr);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void shouldCheckFalsePermutation() {
        // given
        int[] arr = { 4, 1, 3 };

        // when
        int result = underTest.isPermutation(arr);

        // then
        assertThat(result).isEqualTo(0);
    }

}
