package me.wellyfrs.codility.lessons.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDivTest {

    private final CountDiv underTest = new CountDiv();

    @Test
    void solution() {
        // given
        int A = 6;
        int B = 11;
        int K = 2;

        // when
        int result = underTest.solution(A, B, K);

        // then
        assertEquals(3, result);
    }
}