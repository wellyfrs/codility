package me.wellyfrs.codility.lessons.lesson2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OddOccurrencesInArrayTest {

    private final OddOccurrencesInArray underTest = new OddOccurrencesInArray();

    @Test
    void testSolution() {
        // given
        int[] arr = { 9, 3, 9, 3, 9, 7, 9 };

        // when
        int result = underTest.findUnpairedElement(arr);

        // then
        assertThat(result).isEqualTo(7);
    }

}