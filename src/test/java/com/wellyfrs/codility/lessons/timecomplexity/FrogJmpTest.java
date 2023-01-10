package com.wellyfrs.codility.lessons.timecomplexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(3, result);
    }

}