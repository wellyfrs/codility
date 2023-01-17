package me.wellyfrs.codility.lessons.lesson7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BracketsTest {

    private final Brackets underTest = new Brackets();

    @Test
    void shouldRecognizeBalancedString() {
        // given
        String S = "{[()()]}";

        // when
        int result = underTest.solution(S);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void shouldNotRecognizeBalancedString() {
        // given
        String S = "([)()]";

        // when
        int result = underTest.solution(S);

        // then
        assertThat(result).isEqualTo(0);
    }
}