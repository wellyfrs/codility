package com.wellyfrs.codility.lessons.lesson3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrogJmpTest {

    @ParameterizedTest
    @MethodSource
    void solution(int X, int Y, int D, int expected) {
        assertEquals(expected, new FrogJmp().solution(X, Y, D));
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of(10, 85, 30, 3)
        );
    }

}