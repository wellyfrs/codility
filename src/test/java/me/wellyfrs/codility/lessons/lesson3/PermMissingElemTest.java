package me.wellyfrs.codility.lessons.lesson3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PermMissingElemTest {

    private final PermMissingElem underTest = new PermMissingElem();

    @Test
    void testSolution() {
        // given
        int[] arr = { 2, 3, 1, 5 };

        // when
        int result = underTest.findMissingElement(arr);

        // then
        assertThat(result).isEqualTo(4);
    }

}