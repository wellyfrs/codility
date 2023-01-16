package me.wellyfrs.codility.lessons.lesson7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NestingTest {

    private final Nesting underTest = new Nesting();

    @Test
    void shouldRecognizeNestedString() {
        // given
        String S = "(()(())())";

        // when
        int result = underTest.solution(S);

        // then
        assertEquals(1, result);
    }

    @Test
    void shouldNotRecognizeNestedString() {
        // given
        String S = "())";

        // when
        int result = underTest.solution(S);

        // then
        assertEquals(0, result);
    }
}