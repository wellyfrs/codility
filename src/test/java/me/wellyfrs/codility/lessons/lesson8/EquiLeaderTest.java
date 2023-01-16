package me.wellyfrs.codility.lessons.lesson8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EquiLeaderTest {

    private final EquiLeader underTest = new EquiLeader();

    @Test
    void solution() {
        // given
        int[] A = { 4, 3, 4, 4, 4, 2 };

        // when
        int result = underTest.solution(A);

        // then
        assertThat(result).isEqualTo(2);
    }

}
