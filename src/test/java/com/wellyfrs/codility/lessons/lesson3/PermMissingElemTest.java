package com.wellyfrs.codility.lessons.lesson3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermMissingElemTest {

    @ParameterizedTest
    @MethodSource
    void solution(int[] A, int expected) {
        assertEquals(expected, new PermMissingElem().solution(A));
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 1, 5}, 4)
        );
    }

}