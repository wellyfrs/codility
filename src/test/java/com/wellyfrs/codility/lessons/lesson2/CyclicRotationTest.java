package com.wellyfrs.codility.lessons.lesson2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CyclicRotationTest {

    @ParameterizedTest
    @MethodSource
    void solution(int[] A, int K, int[] expected) {
        assertArrayEquals(expected, new CyclicRotation().solution(A, K));
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of(new int[]{3, 8, 9, 7, 6}, 3, new int[]{9, 7, 6, 3, 8}),
                Arguments.of(new int[]{0, 0, 0}, 1, new int[]{0, 0, 0}),
                Arguments.of(new int[]{1, 2, 3, 4}, 4, new int[]{1, 2, 3, 4})
        );
    }

}