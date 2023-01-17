package me.wellyfrs.codility.lessons.lesson5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PassingCarsTest {

    private final PassingCars underTest = new PassingCars();

    @Test
    void solution() {
        // given
        int[] arr = { 0, 1, 0, 1, 1 };

        // when
        int result = underTest.countPassingCars(arr);

        // then
        assertThat(result).isEqualTo(5);
    }
}