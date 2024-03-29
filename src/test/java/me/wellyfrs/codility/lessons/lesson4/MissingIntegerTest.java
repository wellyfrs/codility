package me.wellyfrs.codility.lessons.lesson4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MissingIntegerTest {

    private final MissingInteger underTest = new MissingInteger();

    @ParameterizedTest
    @MethodSource("provideArgs")
    void testSolution(int[] arr, int expected) {
        // when
        int result = underTest.findSmallestMissingPositiveInteger(arr);

        // then
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> provideArgs() {
        return Stream.of(
                Arguments.of(new int[]{ 1, 3, 6, 4, 1, 2 }, 5),
                Arguments.of(new int[]{ 1, 2, 3 }, 4),
                Arguments.of(new int[]{ -1, -3 }, 1)
        );
    }
}