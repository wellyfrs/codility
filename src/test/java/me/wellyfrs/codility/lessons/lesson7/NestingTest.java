package me.wellyfrs.codility.lessons.lesson7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NestingTest {

    private final Nesting underTest = new Nesting();

    @Test
    void shouldRecognizeNestedString() {
        // given
        String S = "(()(())())";

        // when
        int result = underTest.solution(S);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void shouldNotRecognizeNestedString() {
        // given
        String S = "())";

        // when
        int result = underTest.solution(S);

        // then
        assertThat(result).isEqualTo(0);
    }
}