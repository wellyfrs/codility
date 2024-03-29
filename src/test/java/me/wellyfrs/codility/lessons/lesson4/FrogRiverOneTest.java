package me.wellyfrs.codility.lessons.lesson4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrogRiverOneTest {

    private final FrogRiverOne underTest = new FrogRiverOne();

    @Test
    void testSolution() {
        // given
        int lastPosition = 5;
        int[] fallingLeaves = {1, 3, 1, 4, 2, 3, 5, 4};

        // when
        int result = underTest.solution(lastPosition, fallingLeaves);

        // then
        assertThat(result).isEqualTo(6);
    }

}
