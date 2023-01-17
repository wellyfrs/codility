package me.wellyfrs.codility.lessons.lesson6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxProductOfThreeTest {

    private final MaxProductOfThree underTest = new MaxProductOfThree();

    @Test
    void solution() {
        // given
        int[] arr = { -3, 1, 2, -2, 5, 6 };

        // when
        int result = underTest.calculateMaxProductOfTriplets(arr);

        // then
        assertThat(result).isEqualTo(60);
    }
}