package com.wellyfrs.codility.lessons.lesson1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryGapTest {

    @ParameterizedTest
    @MethodSource
    void solution(int N, int expected) {
        assertEquals(expected, new BinaryGap().solution(N));
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of(1041, 5),
                Arguments.of(15, 0),
                Arguments.of(32, 0)
        );
    }

}