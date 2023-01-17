package me.wellyfrs.codility.lessons.lesson6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DistinctTest {

    private final Distinct underTest = new Distinct();

    @Test
    void shouldReturnNumberOfDistinctItemsByUsingSorting() {
        // given
        int[] A = {2, 1, 1, 2, 3, 1};

        // when
        int result = underTest.countDistinctItemsUsingSorting(A);

        // then
        assertThat(result).isEqualTo(3);
    }

    @Test
    void shouldReturnNumberOfDistinctItemsByUsingSet() {
        // given
        int[] A = {2, 1, 1, 2, 3, 1};

        // when
        int result = underTest.countDistinctItemsCleverly(A);

        // then
        assertThat(result).isEqualTo(3);
    }
}