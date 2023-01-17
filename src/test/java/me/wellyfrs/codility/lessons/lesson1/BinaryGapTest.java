package me.wellyfrs.codility.lessons.lesson1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryGapTest {

    private final BinaryGap underTest = new BinaryGap();

    @ParameterizedTest
    @MethodSource("provideArgs")
    void testSolution(int n, int expected) {
        // when
        int result = underTest.findLongestBinaryGapLength(n);

        // then
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> provideArgs() {
        return Stream.of(
                Arguments.of(1041, 5),
                Arguments.of(15, 0),
                Arguments.of(32, 0)
        );
    }

}