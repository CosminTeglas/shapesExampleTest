package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void calculatePerimeter() {
        //given
       Rectangle rectangle = new Rectangle(3D, 4D);
        //when
        double result = rectangle.calculatePerimeter();
        //then
        assertEquals(14D, result, 0.00001);
    }
}