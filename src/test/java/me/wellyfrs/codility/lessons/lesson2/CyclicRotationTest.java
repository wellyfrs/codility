package me.wellyfrs.codility.lessons.lesson2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CyclicRotationTest {

    private final CyclicRotation underTest = new CyclicRotation();

    @ParameterizedTest
    @MethodSource("provideArgs")
    void testSolution(int[] arr, int steps, int[] expected) {
        // when
        int[] result = underTest.rotateArray(arr, steps);

        // then
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> provideArgs() {
        return Stream.of(
                Arguments.of(new int[]{ 3, 8, 9, 7, 6 }, 3, new int[]{ 9, 7, 6, 3, 8 }),
                Arguments.of(new int[]{ 0, 0, 0 }, 1, new int[]{ 0, 0, 0 }),
                Arguments.of(new int[]{ 1, 2, 3, 4 }, 4, new int[]{ 1, 2, 3, 4 })
        );
    }

}