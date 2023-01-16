package me.wellyfrs.codility.lessons.lesson8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DominatorTest {

    private final Dominator underTest = new Dominator();

    @Test
    void shouldReturnAnyIndexOfDominator() {
        // given
        int[] A = { 3, 4, 3, 2, 3, -1, 3, 3 };

        // when
        int result = underTest.findAnyIndexOfDominator(A);

        // then
        assertThat(result).isIn(0, 2, 4, 6, 7);
    }
}