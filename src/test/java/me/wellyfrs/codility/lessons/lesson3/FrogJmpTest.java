package me.wellyfrs.codility.lessons.lesson3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FrogJmpTest {

    private final FrogJmp underTest = new FrogJmp();

    @Test
    void testSolution() {
        // given
        int origin = 10;
        int destiny = 85;
        int distance = 30;

        // when
        int result = underTest.calculateMinNumberOfJumps(origin, destiny, distance);
        
        // then
        assertThat(result).isEqualTo(3);
    }

}