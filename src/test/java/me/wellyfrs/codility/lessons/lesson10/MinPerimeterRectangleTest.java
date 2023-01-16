package me.wellyfrs.codility.lessons.lesson10;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinPerimeterRectangleTest {

    private final MinPerimeterRectangle underTest = new MinPerimeterRectangle();

    @Test
    void solution() {
        // given
        int N = 30;

        // when
        int result = underTest.solution(N);

        // then
        assertThat(result).isEqualTo(22);
    }
}