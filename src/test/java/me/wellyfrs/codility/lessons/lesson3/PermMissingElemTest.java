package me.wellyfrs.codility.lessons.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermMissingElemTest {

    private final PermMissingElem underTest = new PermMissingElem();

    @Test
    void testSolution() {
        // given
        int[] arr = { 2, 3, 1, 5 };

        // when
        int result = underTest.findMissingElement(arr);

        // then
        assertEquals(4, result);
    }

}