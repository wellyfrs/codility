package me.wellyfrs.codility.lessons.lesson7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StoneWallTest {

    private final StoneWall underTest = new StoneWall();

    @Test
    void solution() {
        // given
        int[] H = { 8, 8, 5, 7, 9, 8, 7, 4, 8 };

        // when
        int result = underTest.solution(H);

        // then
        assertThat(result).isEqualTo(7);
    }
}