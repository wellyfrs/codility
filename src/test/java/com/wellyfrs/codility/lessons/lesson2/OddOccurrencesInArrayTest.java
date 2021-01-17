package com.wellyfrs.codility.lessons.lesson2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddOccurrencesInArrayTest {

    @ParameterizedTest
    @MethodSource
    void solution(int[] A, int expected) {
        assertEquals(expected, new OddOccurrencesInArray().solution(A));
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of(new int[]{9, 3, 9, 3, 9, 7, 9}, 7)
        );
    }

}