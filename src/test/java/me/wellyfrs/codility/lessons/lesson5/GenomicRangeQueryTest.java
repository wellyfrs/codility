package me.wellyfrs.codility.lessons.lesson5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class GenomicRangeQueryTest {

    private final GenomicRangeQuery underTest = new GenomicRangeQuery();

    @Test
    void shouldReturnImpactFactorOfSimpleDNASeq() {
        // given
        String S = "CAGCCTA";
        int[] P = { 2, 5, 0 };
        int[] Q = { 4, 5, 6 };

        // when
        int[] result = underTest.findMinImpactFactor(S, P, Q);

        // then
        assertThat(result).isEqualTo(new int[] { 2, 4, 1 });
    }

    @ParameterizedTest
    @MethodSource("provideSingleDNASequences")
    void shouldReturnImpactFactorOfSingleNucleotideDNASeq(String S, int[] expected) {
        // given
        int[] P = { 0 };
        int[] Q = { 0 };

        // when
        int[] result = underTest.findMinImpactFactor(S, P, Q);

        // then
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> provideSingleDNASequences() {
        return Stream.of(
                Arguments.of("A", new int[] { GenomicRangeQuery.Nucleotide.A.impactFactor }),
                Arguments.of("C", new int[] { GenomicRangeQuery.Nucleotide.C.impactFactor }),
                Arguments.of("G", new int[] { GenomicRangeQuery.Nucleotide.G.impactFactor }),
                Arguments.of("T", new int[] { GenomicRangeQuery.Nucleotide.T.impactFactor })
        );
    }
}