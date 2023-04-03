package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
        @Test
        void givenSideShouldCalculateSurface() {
            //given
            Square square = new Square(5);
            //when
            double result = square.calculateSurface();
            //then
            assertEquals(25.0, result, 0.00001);
        }

    @Test
    void calculateSurface() {
    }
}