package me.wellyfrs.codility.lessons.lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermCheckTest {

    private final PermCheck underTest = new PermCheck();

    @Test
    void shouldCheckTruePermutation() {
        // given
        int[] arr = { 4, 1, 3, 2 };

        // when
        int result = underTest.isPermutation(arr);

        // then
        assertEquals(1, result);
    }

    @Test
    void shouldCheckFalsePermutation() {
        // given
        int[] arr = { 4, 1, 3 };

        // when
        int result = underTest.isPermutation(arr);

        // then
        assertEquals(0, result);
    }

}
