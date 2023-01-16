package me.wellyfrs.codility.lessons.lesson7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsTest {

    private final Brackets underTest = new Brackets();

    @Test
    void shouldRecognizeBalancedString() {
        // given
        String S = "{[()()]}";

        // when
        int result = underTest.solution(S);

        // then
        assertEquals(1, result);
    }

    @Test
    void shouldNotRecognizeBalancedString() {
        // given
        String S = "([)()]";

        // when
        int result = underTest.solution(S);

        // then
        assertEquals(0, result);
    }
}